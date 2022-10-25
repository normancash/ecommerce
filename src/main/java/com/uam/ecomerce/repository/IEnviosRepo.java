package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.Envios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IEnviosRepo extends JpaRepository<Envios, UUID> {
}
