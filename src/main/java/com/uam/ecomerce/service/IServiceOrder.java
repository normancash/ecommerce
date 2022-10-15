package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceOrder {

    public List<Order> listAll();

    public Order saveOrder(Order order);
}
