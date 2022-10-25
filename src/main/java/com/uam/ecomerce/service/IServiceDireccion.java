package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Direccion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceDireccion {

    public List<Direccion> listAll();


    Direccion save(Direccion direccion);
}
