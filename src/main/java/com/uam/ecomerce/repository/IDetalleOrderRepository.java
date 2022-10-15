package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.DetalleOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleOrderRepository extends JpaRepository<DetalleOrder,Long> {
}
