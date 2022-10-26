package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Carrito;
import com.uam.ecomerce.repository.ICarritoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceCarrito")
public class ImpServiceCarrito implements IServiceCarrito {

    @Autowired
    private ICarritoRepo carritoRepo;

    @Override
    public List<Carrito> listAll() {
        return carritoRepo.findAll();
    }

    @Override
    public Carrito save(Carrito carrito) {
        return carritoRepo.save(carrito);
    }
}
