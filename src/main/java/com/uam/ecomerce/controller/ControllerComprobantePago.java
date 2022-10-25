package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.Catologo;
import com.uam.ecomerce.model.ComprobanteCompra;
import com.uam.ecomerce.service.IServiceComprobantePago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comprobantepago")
public class ControllerComprobantePago {

    @Qualifier("IServiceComprobantePago")
    @Autowired
    private IServiceComprobantePago serviceComprobantePago;

    @GetMapping("list")
    private List<ComprobanteCompra> listAll(){
        return serviceComprobantePago.listAll();
    }

    @PostMapping("/save")
    private ComprobanteCompra save(@RequestBody ComprobanteCompra comprobanteCompra) {
        return serviceComprobantePago.save(comprobanteCompra);
    }

}
