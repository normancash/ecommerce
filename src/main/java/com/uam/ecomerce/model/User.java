package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @SequenceGenerator(name = "detalle_seq",
            sequenceName = "detalle_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "detalle_seq")
    private UUID id_usuario;

    private String email;
    private String login;
    private boolean status;
    private String password;
}
