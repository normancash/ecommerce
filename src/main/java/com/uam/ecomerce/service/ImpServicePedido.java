package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Pedido;
import com.uam.ecomerce.repository.IPedidoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("servicePedido")
public class ImpServicePedido implements IServicePedido {

    @Autowired
    private IPedidoRepo pedidoRepo;

    @Override
    public List<Pedido> listAll() {
        return pedidoRepo.findAll();
    }

    @Override
    public Pedido save(Pedido pedido) {
        return pedidoRepo.save(pedido);
    }
}
