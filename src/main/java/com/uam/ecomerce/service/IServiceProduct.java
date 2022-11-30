package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface IServiceProduct {

    public List<Product> getListProduct();


    public Product findById(Long id);

     Product saveProduct(String productDto, MultipartFile image)
            throws IOException;

    public void deleteProduct(Long id);

    Product saveProductJson(Product product);

    List<Product> getProductDisplay();

    List<Product> getListProduct(Long idCategory);
}
