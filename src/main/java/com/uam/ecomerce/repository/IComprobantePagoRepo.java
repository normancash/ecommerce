package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.ComprobanteCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IComprobantePagoRepo extends JpaRepository<ComprobanteCompra, UUID> {
}
