package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Rol;
import com.uam.ecomerce.model.User;
import com.uam.ecomerce.service.IServiceRol;
import com.uam.ecomerce.service.IServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class ControllerRol {

    @Qualifier("IServiceRol")
    @Autowired
    private IServiceRol serviceRol;

    @GetMapping("list")
    private List<Rol> listAll(){
        return serviceRol.listAll();
    }

    @PostMapping("/save")
    private Rol save(@RequestBody Rol rol) {
        return serviceRol.save(rol);
    }

}
