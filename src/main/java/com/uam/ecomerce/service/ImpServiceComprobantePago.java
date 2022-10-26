package com.uam.ecomerce.service;

import com.uam.ecomerce.model.ComprobanteCompra;
import com.uam.ecomerce.repository.IComprobantePagoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceComprobantePago")
public class ImpServiceComprobantePago implements IServiceComprobantePago {

    @Autowired
    private IComprobantePagoRepo comprobantePagoRepo;

    @Override
    public List<ComprobanteCompra> listAll() {
        return comprobantePagoRepo.findAll();
    }

    @Override
    public ComprobanteCompra save(ComprobanteCompra comprobanteCompra) {
        return comprobantePagoRepo.save(comprobanteCompra);
    }
}
