package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Category;
import com.uam.ecomerce.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("serviceCategory")
public class ImpServiceCategory implements IServiceCategory{

    @Autowired
    private ICategoryRepository repo;

    @Override
    public List<Category> listAll() {
        return repo.findAll();
    }

    @Override
    public Category save(Category category) {
        return repo.save(category);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
