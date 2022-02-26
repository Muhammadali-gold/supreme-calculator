package com.dreamsoft.supremecalculator.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="auth_users")
@Data
public class Users extends BaseEntity{

    private String username;
    private String password;
    private String email;
    private String fullName;
}
