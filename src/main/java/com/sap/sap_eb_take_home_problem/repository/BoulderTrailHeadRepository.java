package com.sap.sap_eb_take_home_problem.repository;

import com.sap.sap_eb_take_home_problem.model.BoulderTrailHeadEntity;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Repository;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sap.sap_eb_take_home_problem.ultile.CovertHelper.convertValue;

@Repository
public class BoulderTrailHeadRepository {
    String filePath = "./BoulderTrailHeads.csv";

    private List<BoulderTrailHeadEntity> readCore(Map<String, String> filterMap) {
        List<BoulderTrailHeadEntity> entities = new ArrayList<>();
        try {
            FileReader reader = new FileReader(filePath);

            // format
            CSVFormat format = CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase();

            CSVParser csvParser = new CSVParser(reader, format);

            // Extract headers from the CSV
            Map<String, Integer> headerMap = csvParser.getHeaderMap();

            for (CSVRecord csvRecord : csvParser) {
                boolean isFilterOut = false;
                BoulderTrailHeadEntity entity = BoulderTrailHeadEntity.class.getDeclaredConstructor().newInstance();

                // Use reflection to set fields dynamically based on CSV headers
                for (Field field : BoulderTrailHeadEntity.class.getDeclaredFields()) {

                    field.setAccessible(true); // Allow access to private fields

                    String header = field.getName(); // The header name should match the entity field name

                    if (headerMap.keySet().contains(header)) {
                        String value = csvRecord.get(header);

                        if (!filterMap.isEmpty() && filterMap.keySet().contains(header) && !(filterMap.get(header).equals(value))) {
                            isFilterOut = true;
                        }

                        // Convert the string value to the appropriate field type
                        Object convertedValue = convertValue(field.getType(), value);
                        field.set(entity, convertedValue);  // Set the field value
                    }
                }

                // filter out by "Not select" property
                if (!isFilterOut) {
                    entities.add(entity);
                }
            }
            return entities;
        } catch (IOException | InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public List<BoulderTrailHeadEntity> readAll() {
        return readCore(new HashMap<>());
    }

    public List<BoulderTrailHeadEntity> readWithFilter(Map<String, String> filterMap) {
        return readCore(filterMap);
    }

}
