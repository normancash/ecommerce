package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Envios;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceEnvios {

    public List<Envios> listAll();


    Envios save(Envios envios);
}
