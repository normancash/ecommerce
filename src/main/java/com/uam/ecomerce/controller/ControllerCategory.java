package com.uam.ecomerce.controller;


import com.uam.ecomerce.model.Category;
import com.uam.ecomerce.service.IServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class ControllerCategory {

    @Autowired
    @Qualifier("serviceCategory")
    private IServiceCategory service;

    @GetMapping("/list")
    public List<Category> listAll(){
        return service.listAll();
    }

    @PostMapping("/save")
    public Category saveCategory(@RequestBody Category category){
        return service.save(category);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Long id){
        service.delete(id);
    }
}
