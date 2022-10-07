package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceProduct {

    public List<Product> getListProduct();
}
