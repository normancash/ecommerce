package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="comprobantepago")
@Data
public class ComprobanteCompra {

    @Id
    @GeneratedValue
    private UUID id_comprobante_pago;

    private String fecha;
}
