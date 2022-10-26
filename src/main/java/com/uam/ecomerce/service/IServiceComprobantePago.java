package com.uam.ecomerce.service;

import com.uam.ecomerce.model.ComprobanteCompra;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceComprobantePago{

    public List<ComprobanteCompra> listAll();


    ComprobanteCompra save(ComprobanteCompra comprobanteCompra);
}
