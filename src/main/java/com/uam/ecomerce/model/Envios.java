package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="envios")
@Data
public class Envios {

    @Id
    @GeneratedValue
    private UUID id_envios;

    private String fecha_envio;
}
