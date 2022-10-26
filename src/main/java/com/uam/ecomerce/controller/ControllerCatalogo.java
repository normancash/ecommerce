package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Catalogo;
import com.uam.ecomerce.service.IServiceCatalogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogo")
public class ControllerCatalogo {

    @Qualifier("serviceCatalogo")
    @Autowired
    private IServiceCatalogo serviceCatologo;

    @GetMapping("list")
    private List<Catalogo> listAll(){
        return serviceCatologo.listAll();
    }

    @PostMapping("/save")
    private Catalogo save(@RequestBody Catalogo catalogo) {
        return serviceCatologo.save(catalogo);
    }

}
