package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Client;
import com.uam.ecomerce.service.IServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ControllerClient {

    @Autowired
    @Qualifier("serviceClient")
    private IServiceClient service;

    @GetMapping("/list")
    public List<Client> getAll(){
        return service.listAll();
    }

    @PostMapping("/save")
    public Client save(@RequestBody Client client) {
        return service.save(client);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
