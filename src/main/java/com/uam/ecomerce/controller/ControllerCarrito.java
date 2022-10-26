package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Carrito;
import com.uam.ecomerce.service.IServiceCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class ControllerCarrito {

    @Qualifier("serviceCarrito")
    @Autowired
    private IServiceCarrito serviceCarrito;

    @GetMapping("list")
    private List<Carrito> listAll(){
        return serviceCarrito.listAll();
    }

    @PostMapping("/save")
    private Carrito save(@RequestBody Carrito carrito) {
        return serviceCarrito.save(carrito);
    }

}
