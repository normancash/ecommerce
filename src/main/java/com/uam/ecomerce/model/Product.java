package com.uam.ecomerce.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PRODUCT")
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

    private String imagen;

    private int quantity;

    private boolean display;

    /*@ManyToOne
    @JoinColumn(name="id_category")
    private Category category;*/
    @Column(name="id_category")
    private Long idCategory;

    private float price;


}
