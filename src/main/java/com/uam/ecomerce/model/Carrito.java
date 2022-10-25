package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="carrito")
@Data
public class Carrito {

    @Id
    @GeneratedValue
    private UUID id_carrito;

    private int total_productos;
}
