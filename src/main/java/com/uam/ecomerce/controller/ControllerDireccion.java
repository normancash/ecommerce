package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Direccion;
import com.uam.ecomerce.model.Rol;
import com.uam.ecomerce.model.User;
import com.uam.ecomerce.service.IServiceDireccion;
import com.uam.ecomerce.service.IServiceRol;
import com.uam.ecomerce.service.IServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direccion")
public class ControllerDireccion {

    @Qualifier("serviceDireccion")
    @Autowired
    private IServiceDireccion serviceDireccion;

    @GetMapping("list")
    private List<Direccion> listAll(){
        return serviceDireccion.listAll();
    }

    @PostMapping("/save")
    private Direccion save(@RequestBody Direccion direccion) {
        return serviceDireccion.save(direccion);
    }

}
