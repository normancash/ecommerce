package com.uam.ecomerce.service;

import com.uam.ecomerce.model.MetodoPago;
import org.springframework.stereotype.Service;

import java.beans.MethodDescriptor;
import java.util.List;

@Service
public interface IServiceMetodoPago {

    public List<MetodoPago> listAll();


    MetodoPago save(MetodoPago metodoPago);
}
