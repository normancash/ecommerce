package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Carrito;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceCarrito {

    public List<Carrito> listAll();


    Carrito save(Carrito carrito);
}
