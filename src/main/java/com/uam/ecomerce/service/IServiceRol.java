package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Rol;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceRol {

    public List<Rol> listAll();


    Rol save(Rol rol);
}
