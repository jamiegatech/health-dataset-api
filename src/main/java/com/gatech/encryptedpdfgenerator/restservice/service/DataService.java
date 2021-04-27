package com.gatech.encryptedpdfgenerator.restservice.service;


import com.gatech.encryptedpdfgenerator.restservice.dtos.MetricDto;
import com.gatech.encryptedpdfgenerator.restservice.model.Metric;
import com.gatech.encryptedpdfgenerator.restservice.repository.DataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class DataService {
    private final DataRepository dataRepository;

    @Autowired
    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public List<MetricDto> getAll(){
        List<Metric> metrics = (List<Metric>) dataRepository.findAll();
        return metrics.stream().filter(Objects::nonNull).map(MetricDto::from).collect(Collectors.toList());
    }

    public void saveMetric(MetricDto metricDto){
        dataRepository.save(Metric.to(metricDto));
    }
}
