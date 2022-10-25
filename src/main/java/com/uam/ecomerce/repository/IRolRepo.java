package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRolRepo extends JpaRepository<Rol, UUID> {
}
