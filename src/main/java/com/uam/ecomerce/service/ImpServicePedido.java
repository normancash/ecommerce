package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Catologo;
import com.uam.ecomerce.model.Pedido;
import com.uam.ecomerce.model.Rol;
import com.uam.ecomerce.model.User;
import com.uam.ecomerce.repository.ICatologoRepo;
import com.uam.ecomerce.repository.IPedidoRepo;
import com.uam.ecomerce.repository.IRolRepo;
import com.uam.ecomerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
