package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServicePedido {

    public List<Pedido> listAll();


    Pedido save(Pedido pedido);
}
