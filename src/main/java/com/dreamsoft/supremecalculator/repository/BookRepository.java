package com.dreamsoft.supremecalculator.repository;

import com.dreamsoft.supremecalculator.entity.relationships.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> { }
