package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="rol")
@Data
public class Rol {

    @Id
    @GeneratedValue
    private UUID id_rol;

    private String name;
}
