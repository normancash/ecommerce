package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
