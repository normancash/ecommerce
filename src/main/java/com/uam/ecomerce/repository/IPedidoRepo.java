package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IPedidoRepo extends JpaRepository<Pedido, UUID> {
}
