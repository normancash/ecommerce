package com.uam.ecomerce.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "PRODUCT")
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;

}
