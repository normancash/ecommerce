package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Order;
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

    @Override
    public List<Order> listAll() {
        return repo.findAll();
    }

    @Override
    public Order saveOrder(Order order) {
        return repo.save(order);
    }
}
