package com.gatech.encryptedpdfgenerator.restservice.repository;

import com.gatech.encryptedpdfgenerator.restservice.model.Metric;
import org.springframework.data.repository.CrudRepository;

public interface DataRepository extends CrudRepository<Metric, Integer> {
}
