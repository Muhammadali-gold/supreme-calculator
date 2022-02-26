package com.dreamsoft.supremecalculator.entity;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Entity
@Table(name="history")
@Data
public class CalculationHistory extends BaseEntity{

//    @ManyToOne
//    @JoinColumn(name = "operation_id")
//    @RestResource(path = "operation", rel="operation")
//    private Operation operation;

    private String calculationBody;

    private String calculationAnswer;

}
