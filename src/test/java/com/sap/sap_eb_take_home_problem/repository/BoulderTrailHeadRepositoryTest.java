package com.sap.sap_eb_take_home_problem.repository;


import com.sap.sap_eb_take_home_problem.model.BoulderTrailHeadEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoulderTrailHeadRepositoryTest {

    @InjectMocks
    BoulderTrailHeadRepository boulderTrailHeadRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    public void testFindAll() {
        List<BoulderTrailHeadEntity> result = boulderTrailHeadRepository.readAll();
        Assertions.assertEquals(37, result.size());
    }

    @Test
    public void testFind() {
        Map<String,String> filterMap = new HashMap<>();
        filterMap.put("restrooms", "No");
        filterMap.put("picnic", "Yes");
        List<BoulderTrailHeadEntity> result = boulderTrailHeadRepository.readWithFilter(filterMap);
        for(BoulderTrailHeadEntity entity : result){
            Assertions.assertEquals(false, entity.getRestrooms());
            Assertions.assertEquals(true, entity.getPicnic());
        }
    }
}
