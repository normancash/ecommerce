package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ICarritoRepo extends JpaRepository<Carrito, UUID> {
}
