package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Product;
import com.uam.ecomerce.service.IServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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


    @PostMapping("/save")
    public Product saveProduct(@RequestPart("product")  String productDto, @RequestPart("image") MultipartFile image) throws IOException {
        return service.saveProduct(productDto,image);
    }

    @GetMapping({"/{id}"})
    public Product getProduct(@PathVariable Long id) {
       return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
    }

    @GetMapping("/getProduct")
    public List<Product> getProduct(){
        return service.getListProductDisplay();
    }
}
