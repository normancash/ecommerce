package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Category;

import java.util.List;

public interface IServiceCategory {

    public List<Category> listAll();

    public Category save(Category category);

    public void delete(Long id);
}
