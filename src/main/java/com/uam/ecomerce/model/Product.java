package com.uam.ecomerce.model;


import lombok.Data;

import javax.persistence.*;
import java.awt.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private UUID id_product;

    private String name;

    private String description;

    private Float price;

    private String image;

    private int stock;

}
