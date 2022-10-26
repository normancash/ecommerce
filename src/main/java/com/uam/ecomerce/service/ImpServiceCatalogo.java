package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Catalogo;
import com.uam.ecomerce.repository.ICatalogoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceCatalogo")
public class ImpServiceCatalogo implements IServiceCatalogo {

    @Autowired
    private ICatalogoRepo catalogoRepo;

    @Override
    public List<Catalogo> listAll() {
        return catalogoRepo.findAll();
    }

    @Override
    public Catalogo save(Catalogo catalogo) {
        return catalogoRepo.save(catalogo);
    }
}
