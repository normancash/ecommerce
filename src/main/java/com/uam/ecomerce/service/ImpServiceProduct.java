package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Product;
import com.uam.ecomerce.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceProduct")
public class ImpServiceProduct implements IServiceProduct{

    @Autowired
    private IProductRepository repo;

    @Override
    public List<Product> getListProduct() {
        return repo.findAll();
    }
}
