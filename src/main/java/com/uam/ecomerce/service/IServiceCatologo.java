package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Catologo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceCatologo {

    public List<Catologo> listAll();


    Catologo save(Catologo catologo);
}
