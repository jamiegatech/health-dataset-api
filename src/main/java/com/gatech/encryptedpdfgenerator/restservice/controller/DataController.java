package com.gatech.encryptedpdfgenerator.restservice.controller;

import com.gatech.encryptedpdfgenerator.restservice.dtos.MetricDto;
import com.gatech.encryptedpdfgenerator.restservice.service.DataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class DataController {
    private final DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping(value = "/heart-health/dataset")
    public List<MetricDto> retrieveDataset(){
        return dataService.getAll();
    }

    @PostMapping(value = "/heart-health/datapoint")
    public void uploadData(@RequestBody MetricDto metric){
        dataService.saveMetric(metric);
    }
}
