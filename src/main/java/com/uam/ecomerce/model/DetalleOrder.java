package com.uam.ecomerce.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class DetalleOrder {

    @Id
    @SequenceGenerator(name = "detalle_seq",
            sequenceName = "detalle_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "detalle_seq")
    private UUID id_detalle_order;

    private Long id_Producto;

    private int count;


   // private Long idOrder;

    @ManyToOne
    @JoinColumn(name="id_order")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Order order;


}
