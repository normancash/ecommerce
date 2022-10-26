package com.uam.ecomerce.service;

import com.uam.ecomerce.model.DetalleOrder;
import com.uam.ecomerce.model.Rol;
import com.uam.ecomerce.model.User;
import com.uam.ecomerce.repository.IDetalleOrderRepository;
import com.uam.ecomerce.repository.IRolRepo;
import com.uam.ecomerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpServiceDetalleOrder implements IServiceDetalleOrder {

    @Autowired
    private IDetalleOrderRepository detalleOrderRepo;

    @Override
    public List<DetalleOrder> listAll() {
        return detalleOrderRepo.findAll();
    }

    @Override
    public DetalleOrder save(DetalleOrder detalleOrder) {
        return detalleOrderRepo.save(detalleOrder);
    }
}
