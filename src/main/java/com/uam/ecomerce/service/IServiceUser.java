package com.uam.ecomerce.service;

import com.uam.ecomerce.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceUser {

    public List<User> listAll();


    User save(User user);
}
