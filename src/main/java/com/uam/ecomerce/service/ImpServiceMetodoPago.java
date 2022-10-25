package com.uam.ecomerce.service;


import com.uam.ecomerce.model.MetodoPago;
import com.uam.ecomerce.repository.IMetodoPagoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpServiceMetodoPago implements IServiceMetodoPago {

    @Autowired
    private IMetodoPagoRepo metodoPagoRepo;

    @Override
    public List<MetodoPago> listAll() {
        return metodoPagoRepo.findAll();
    }

    @Override
    public MetodoPago save(MetodoPago metodoPago) {
        return metodoPagoRepo.save(metodoPago);
    }
}
