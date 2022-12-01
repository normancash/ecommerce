package com.uam.ecomerce.model;


import lombok.Data;

import javax.persistence.*;

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
    private Long id;

    private String name;

    private String description;

    private Float price;

    private String image;

    private int cant;

    private boolean display;
}


