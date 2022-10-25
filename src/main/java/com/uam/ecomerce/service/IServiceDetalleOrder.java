package com.uam.ecomerce.service;

import com.uam.ecomerce.model.DetalleOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceDetalleOrder {

    public List<DetalleOrder> listAll();


    DetalleOrder save(DetalleOrder detalleOrder);
}
