package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Long> {
    @Query("select  e from Product e where e.display = true and e.quantity > 0")
    public List<Product> getProductDisplay();


    @Query("select e from Product e where e.idCategory = :idCategory")
    public List<Product> getListProduct(Long idCategory);
}
