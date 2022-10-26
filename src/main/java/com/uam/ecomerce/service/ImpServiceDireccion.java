package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Catologo;
import com.uam.ecomerce.model.Direccion;
import com.uam.ecomerce.model.Rol;
import com.uam.ecomerce.model.User;
import com.uam.ecomerce.repository.ICatologoRepo;
import com.uam.ecomerce.repository.IDireccionRepo;
import com.uam.ecomerce.repository.IRolRepo;
import com.uam.ecomerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceDireccion")
public class ImpServiceDireccion implements IServiceDireccion {

    @Autowired
    private IDireccionRepo direccionRepo;

    @Override
    public List<Direccion> listAll() {
        return direccionRepo.findAll();
    }

    @Override
    public Direccion save(Direccion direccion) {
        return direccionRepo.save(direccion);
    }
}
