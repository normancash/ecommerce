package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Catologo;
import com.uam.ecomerce.model.Rol;
import com.uam.ecomerce.model.User;
import com.uam.ecomerce.repository.ICatologoRepo;
import com.uam.ecomerce.repository.IRolRepo;
import com.uam.ecomerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceCatologo")
public class ImpServiceCatologo implements IServiceCatologo {

    @Autowired
    private ICatologoRepo catologoRepo;

    @Override
    public List<Catologo> listAll() {
        return catologoRepo.findAll();
    }

    @Override
    public Catologo save(Catologo catologo) {
        return catologoRepo.save(catologo);
    }
}
