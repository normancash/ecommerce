package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @GeneratedValue
    @Column(name="id_user")
    private UUID id;

    private String name;

    private String email;

    private String password;
}
