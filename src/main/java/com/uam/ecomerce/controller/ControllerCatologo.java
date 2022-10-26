package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Catologo;
import com.uam.ecomerce.service.IServiceCatologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catologo")
public class ControllerCatologo {

    @Qualifier("serviceCatologo")
    @Autowired
    private IServiceCatologo serviceCatologo;

    @GetMapping("list")
    private List<Catologo> listAll(){
        return serviceCatologo.listAll();
    }

    @PostMapping("/save")
    private Catologo save(@RequestBody Catologo catologo) {
        return serviceCatologo.save(catologo);
    }

}
