package com.dreamsoft.supremecalculator.entity.relationships;

import com.dreamsoft.supremecalculator.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book extends BaseEntity {

    @Column(nullable=false)
    private String title;

    @ManyToOne
    @JoinColumn(name="library_id")
    private Library library;

    // standard constructor, getter, setter
}
