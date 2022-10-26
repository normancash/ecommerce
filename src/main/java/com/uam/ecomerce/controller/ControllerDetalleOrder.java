package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.DetalleOrder;
import com.uam.ecomerce.model.Rol;
import com.uam.ecomerce.model.User;
import com.uam.ecomerce.service.IServiceDetalleOrder;
import com.uam.ecomerce.service.IServiceRol;
import com.uam.ecomerce.service.IServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleorder")
public class ControllerDetalleOrder {

    @Qualifier("serviceDetalleOrder")
    @Autowired
    private IServiceDetalleOrder serviceDetalleOrder;

    @GetMapping("list")
    private List<DetalleOrder> listAll(){
        return serviceDetalleOrder.listAll();
    }

    @PostMapping("/save")
    private DetalleOrder save(@RequestBody DetalleOrder detalleOrder) {
        return serviceDetalleOrder.save(detalleOrder);
    }

}
