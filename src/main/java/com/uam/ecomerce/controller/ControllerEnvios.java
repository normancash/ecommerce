package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Envios;
import com.uam.ecomerce.service.IServiceEnvios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/envios")
public class ControllerEnvios {

    @Qualifier("serviceEnvios")
    @Autowired
    private IServiceEnvios serviceEnvios;

    @GetMapping("list")
    private List<Envios> listAll(){
        return serviceEnvios.listAll();
    }

    @PostMapping("/save")
    private Envios save(@RequestBody Envios envios) {
        return serviceEnvios.save(envios);
    }

}
