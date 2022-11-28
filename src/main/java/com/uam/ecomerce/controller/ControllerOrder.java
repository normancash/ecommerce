package com.uam.ecomerce.controller;


import com.uam.ecomerce.model.Order;
import com.uam.ecomerce.service.IServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class ControllerOrder {

    @Autowired
    @Qualifier("serviceOrder")
    private IServiceOrder service;

    @GetMapping("/list")
    public List<Order> getAll(){
        return service.listAll();
    }

    @PostMapping("/save")
    public Order saveOrder(@RequestBody Order order){
        return service.saveOrder(order);
    }
}
