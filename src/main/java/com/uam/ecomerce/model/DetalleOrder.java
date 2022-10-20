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


   // private Long idOrder;

    @ManyToOne
    @JoinColumn(name="id_order")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Order order;


}
