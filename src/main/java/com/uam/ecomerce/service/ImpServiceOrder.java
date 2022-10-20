package com.uam.ecomerce.service;

import com.uam.ecomerce.model.DetalleOrder;
import com.uam.ecomerce.model.Order;
import com.uam.ecomerce.repository.IDetalleOrderRepository;
import com.uam.ecomerce.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceOrder")
public class ImpServiceOrder implements IServiceOrder {

    @Autowired
    private IOrderRepository repo;

    @Autowired
    private IDetalleOrderRepository repoDet;

    @Override
    public List<Order> listAll() {
        return repo.findAll();
    }

    @Override
    public Order saveOrder(Order order) {
        Order o = new Order();
        o.setName(order.getName());
        o.setTotal(order.getTotal());
        List<DetalleOrder> detalles = order.getDetalles();
        for (DetalleOrder det : detalles) {
            det.setOrder(o);
        }
        o.setDetalles(detalles);
        /*save master
        //order.setDetalles(null);
        //Order o = repo.save(order);
        for (DetalleOrder det : detalles) {
            det.setOrder(o);
        }
        repoDet.saveAll(detalles);
        o.setDetalles(detalles);
        return o;*/
        return repo.save(o);
    }
}
