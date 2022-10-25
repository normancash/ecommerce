package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="pedido")
@Data
public class Pedido {

    @Id
    @GeneratedValue
    private UUID id_pedido;

    private String fecha_pedido;
    private int cantidad;
}
