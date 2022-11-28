package com.uam.ecomerce.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="category")
@Data
public class Category {

    @Id
    @SequenceGenerator(name = "category_seq",
            sequenceName = "category_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "category_seq")
    private Long id;
    private String name;
    private String description;


}
