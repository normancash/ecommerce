package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Carrito;
import com.uam.ecomerce.model.Catologo;
import com.uam.ecomerce.model.Rol;
import com.uam.ecomerce.model.User;
import com.uam.ecomerce.repository.ICarritoRepo;
import com.uam.ecomerce.repository.ICatologoRepo;
import com.uam.ecomerce.repository.IRolRepo;
import com.uam.ecomerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
