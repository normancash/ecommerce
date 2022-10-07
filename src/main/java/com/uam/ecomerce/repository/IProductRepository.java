package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
