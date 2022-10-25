package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="catologo")
@Data
public class Catologo {

    @Id
    @GeneratedValue
    private UUID id_catalogo;

    private String categoria;
    private String descripcion;
    private String imagen;
    private int precio;
    private int stock;
}
