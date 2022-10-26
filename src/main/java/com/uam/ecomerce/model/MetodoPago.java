package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="metodoPago")
@Data
public class MetodoPago {

    @Id
    @GeneratedValue
    private UUID id_metodo_pago;

    private String credito;
    private String debito;
    private String num_transaccion;
}
