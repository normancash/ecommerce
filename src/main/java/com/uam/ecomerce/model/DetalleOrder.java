package com.uam.ecomerce.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DetalleOrder {

    @Id
    @SequenceGenerator(name = "detalle_seq",
            sequenceName = "detalle_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "detalle_seq")
    private Long id;

    private Long idProducto;

    private int count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_order",nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Order order;


}
