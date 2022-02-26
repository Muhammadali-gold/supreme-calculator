package com.dreamsoft.supremecalculator.entity.relationships;

import com.dreamsoft.supremecalculator.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Book extends BaseEntity {

    @Column(nullable=false)
    private String title;

    @ManyToOne
    @JoinColumn(name="library_id")
    private Library library;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;
}
