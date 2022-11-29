package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Long> {
    @Query(value = "select e from Product e where e.display = true")
    List<Product> getProduct();
}
