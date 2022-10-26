package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="direccion")
@Data
public class Direccion {

    @Id
    @SequenceGenerator(name = "detalle_seq",
            sequenceName = "detalle_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "detalle_seq")
    private UUID id_direccion;

    private String apto;
    private String avenue;
    private String street;
    private String city;
    private String num_casa;
    private String office;
    private String country;
}
