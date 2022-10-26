package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Catologo;
import com.uam.ecomerce.model.ComprobanteCompra;
import com.uam.ecomerce.model.Rol;
import com.uam.ecomerce.model.User;
import com.uam.ecomerce.repository.ICatologoRepo;
import com.uam.ecomerce.repository.IComprobantePagoRepo;
import com.uam.ecomerce.repository.IRolRepo;
import com.uam.ecomerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
