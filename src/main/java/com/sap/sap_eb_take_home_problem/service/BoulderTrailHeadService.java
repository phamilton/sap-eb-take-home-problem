package com.sap.sap_eb_take_home_problem.service;

import com.sap.sap_eb_take_home_problem.model.BoulderTrailHeadEntity;
import com.sap.sap_eb_take_home_problem.repository.BoulderTrailHeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoulderTrailHeadService {
    @Autowired
    BoulderTrailHeadRepository boulderTrailHeadRepository;

    public List<BoulderTrailHeadEntity> findAll() {
        List<BoulderTrailHeadEntity> entities = boulderTrailHeadRepository.readAll();
        return entities;
    }

    public List<BoulderTrailHeadEntity> findFilter(Object context) {
        Map<String, String> map = new HashMap<>();

        Class<?> clazz = BoulderTrailHeadEntity.class;

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // Make private fields accessible
            try {
                // Get the value of the field for the given object
                Object value = field.get(context);

                // populate the select data
                if (value != null) {
                    populateToFilterDataToMap(map, field, value);
                }
            } catch (IllegalAccessException e) {
                System.out.println("Could not access field: " + field.getName());
            }
        }
        return boulderTrailHeadRepository.readWithFilter(map);
    }

    private void populateToFilterDataToMap(Map<String, String> map, Field field, Object value) {
        if (String.valueOf(value).equalsIgnoreCase("true")) {
            map.put(field.getName(), "Yes");
        } else if (String.valueOf(value).equalsIgnoreCase("false")) {
            map.put(field.getName(), "No");
        } else {
            map.put(field.getName(), String.valueOf(value));
        }
    }
}
