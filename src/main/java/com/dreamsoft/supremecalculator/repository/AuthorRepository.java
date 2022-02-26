package com.dreamsoft.supremecalculator.repository;

import com.dreamsoft.supremecalculator.entity.relationships.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> { }
