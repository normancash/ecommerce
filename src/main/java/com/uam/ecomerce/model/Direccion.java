package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="direccion")
@Data
public class Direccion {

    @Id
    @GeneratedValue
    private UUID id_direccion;

    private String apto;
    private String avenue;
    private String street;
    private String city;
    private String num_casa;
    private String office;
    private String country;
}
