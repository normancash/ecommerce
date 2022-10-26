package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Rol;
import com.uam.ecomerce.model.User;
import com.uam.ecomerce.repository.IRolRepo;
import com.uam.ecomerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceRol")
public class ImpServiceRol implements IServiceRol {

    @Autowired
    private IRolRepo rolRepo;

    @Override
    public List<Rol> listAll() {
        return rolRepo.findAll();
    }

    @Override
    public Rol save(Rol rol) {
        return rolRepo.save(rol);
    }
}
