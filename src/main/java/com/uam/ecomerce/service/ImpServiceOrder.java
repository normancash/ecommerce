package com.uam.ecomerce.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uam.ecomerce.model.Client;
import com.uam.ecomerce.model.DetalleOrder;
import com.uam.ecomerce.model.Order;
import com.uam.ecomerce.model.Product;
import com.uam.ecomerce.repository.IClientRepository;
import com.uam.ecomerce.repository.IDetalleOrderRepository;
import com.uam.ecomerce.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Component("serviceOrder")
public class ImpServiceOrder implements IServiceOrder {

    @Autowired
    private IOrderRepository repo;

    @Autowired
    private IDetalleOrderRepository repoDet;

    @Autowired
    private IClientRepository repoCli;

    @Override
    public List<Order> listAll() {
        return repo.findAll();
    }

    @Override
    public Order saveOrder(Order order) {
        Order o = new Order();
        //Check if exists client
        Client client = repoCli.findClientByNameLastName(order.getClient().getFirstName(),order.getClient().getLastName());
        if (client == null) {
           client = repoCli.save(order.getClient());
        }
        else {
            client = repoCli.save(client);
        }
        o.setClient(client);
        o.setCreateAt(new Date());
        o.setTotal(order.getTotal());
        o.setPaymentMethod(order.getPaymentMethod());
        List<DetalleOrder> detalles = order.getDetalles();
        for (DetalleOrder det : detalles) {
            det.setOrder(o);
            o.getDetalles().add(det);
        }
        //o.setDetalles(detalles);
        return repo.save(o);
    }
}
