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
    private Integer id_detalle_order;

    private Long id_Producto;

    private int count;


   // private Long idOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_order",nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Order order;


}
