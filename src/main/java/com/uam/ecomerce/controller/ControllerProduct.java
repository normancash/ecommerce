package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Product;
import com.uam.ecomerce.service.IServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ControllerProduct {

    @Qualifier("serviceProduct")
    @Autowired
    private IServiceProduct service;

    @GetMapping("/list")
    public List<Product> getAll() {
        return service.getListProduct();
    }


    public String insertProduct() {
        return null;
    }

    public Product getProduct() {
       return null;
    }

    public void deleteProduct() {

    }
}
