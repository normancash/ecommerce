package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="pedido")
@Data
public class Pedido {

    @Id
    @SequenceGenerator(name = "detalle_seq",
            sequenceName = "detalle_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "detalle_seq")
    private UUID id_pedido;

    private String fecha_pedido;
    private int cantidad;
}
