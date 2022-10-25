package com.uam.ecomerce.service;

import com.uam.ecomerce.model.*;
import com.uam.ecomerce.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpServiceEnvios implements IServiceEnvios {

    @Autowired
    private IEnviosRepo enviosRepo;

    @Override
    public List<Envios> listAll() {
        return enviosRepo.findAll();
    }

    @Override
    public Envios save(Envios envios) {
        return enviosRepo.save(envios);
    }
}
