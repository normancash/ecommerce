package com.uam.ecomerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
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
    private Integer id_order;

    private String name;

    private double total;

    @OneToMany(mappedBy = "order",
            cascade  = CascadeType.ALL,fetch = FetchType.LAZY
    )
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<DetalleOrder> detalles = new ArrayList<>();

}
