package com.uam.ecomerce.model;


import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @SequenceGenerator(name = "product_seq",
            sequenceName = "product_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "product_seq")
    private UUID id_product;
    private String name;
    private String description;
    private String imagen;
    private Float price;
    private int stock;

}
