package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Catalogo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceCatalogo {

    public List<Catalogo> listAll();


    Catalogo save(Catalogo catalogo);
}
