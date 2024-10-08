package com.sap.sap_eb_take_home_problem.controller;

import com.sap.sap_eb_take_home_problem.model.BoulderTrailHeadEntity;
import com.sap.sap_eb_take_home_problem.service.BoulderTrailHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BoulderTrailHeadController {
    @Autowired
    BoulderTrailHeadService boulderTrailHeadService;

    @GetMapping("/findAll")
    public List<BoulderTrailHeadEntity> findAll(){
        return boulderTrailHeadService.findAll();
    }

    @PostMapping("/find")
    public List<BoulderTrailHeadEntity> findWithFilter(@RequestBody BoulderTrailHeadEntity context)  {
        return boulderTrailHeadService.findFilter(context);
    }
}
