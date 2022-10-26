package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Catologo;
import com.uam.ecomerce.model.MetodoPago;
import com.uam.ecomerce.service.IServiceCatologo;
import com.uam.ecomerce.service.IServiceMetodoPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metodopago")
public class ControllerMetodoPago {

    @Qualifier("serviceMetodoPago")
    @Autowired
    private IServiceMetodoPago serviceMetodoPago;

    @GetMapping("list")
    private List<MetodoPago> listAll(){
        return serviceMetodoPago.listAll();
    }

    @PostMapping("/save")
    private MetodoPago save(@RequestBody MetodoPago metodoPago) {
        return serviceMetodoPago.save(metodoPago);
    }

}
