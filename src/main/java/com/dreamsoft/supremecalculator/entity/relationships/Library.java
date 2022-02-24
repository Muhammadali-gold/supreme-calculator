package com.dreamsoft.supremecalculator.entity.relationships;

import com.dreamsoft.supremecalculator.entity.BaseEntity;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class Library extends BaseEntity {

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    @RestResource(path = "libraryAddress    ", rel="address")
    private Address address;


    @OneToMany(mappedBy = "library")
    private List<Book> books;
}
