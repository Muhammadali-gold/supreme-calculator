package com.dreamsoft.supremecalculator.repository;

import com.dreamsoft.supremecalculator.entity.CalculationHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface CalculationHistoryRepository extends CrudRepository<CalculationHistory,Long> {
}
