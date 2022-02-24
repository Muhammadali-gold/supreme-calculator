package com.dreamsoft.supremecalculator.repository;

import com.dreamsoft.supremecalculator.entity.relationships.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {}
