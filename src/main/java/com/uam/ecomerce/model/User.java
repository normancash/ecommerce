package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @GeneratedValue
    private UUID id_usuario;

    private String email;
    private String login;
    private boolean status;
    private String password;
}