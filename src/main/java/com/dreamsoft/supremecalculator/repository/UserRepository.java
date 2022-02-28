package com.dreamsoft.supremecalculator.repository;

import com.dreamsoft.supremecalculator.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface UserRepository extends CrudRepository<Users,Long> {
}
