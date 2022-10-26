package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Catologo;
import com.uam.ecomerce.model.Pedido;
import com.uam.ecomerce.service.IServiceCatologo;
import com.uam.ecomerce.service.IServicePedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class ControllerPedido {

    @Qualifier("servicePedido")
    @Autowired
    private IServicePedido servicePedido;

    @GetMapping("list")
    private List<Pedido> listAll(){
        return servicePedido.listAll();
    }

    @PostMapping("/save")
    private Pedido save(@RequestBody Pedido pedido) {
        return servicePedido.save(pedido);
    }

}
