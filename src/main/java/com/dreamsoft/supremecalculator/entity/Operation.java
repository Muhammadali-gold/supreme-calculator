package com.dreamsoft.supremecalculator.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
@Data
public class Operation extends BaseEntity{


//    @OneToMany(mappedBy = "history")
//    private List<CalculationHistory> histories;

}
