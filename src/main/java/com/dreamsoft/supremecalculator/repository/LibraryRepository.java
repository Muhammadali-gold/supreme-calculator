package com.dreamsoft.supremecalculator.repository;

import com.dreamsoft.supremecalculator.entity.relationships.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long> {}
