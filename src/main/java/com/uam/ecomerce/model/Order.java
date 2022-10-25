package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name="Orders")
public class Order {

    @Id
    @SequenceGenerator(name = "order_seq",
            sequenceName = "order_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "order_seq")
    private UUID id_order;

    private String name;

    private double total;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    private List<DetalleOrder> detalles;

}
