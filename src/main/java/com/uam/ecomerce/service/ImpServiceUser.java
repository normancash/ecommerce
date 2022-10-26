package com.uam.ecomerce.service;

import com.uam.ecomerce.model.User;
import com.uam.ecomerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("serviceUser")
public class ImpServiceUser implements IServiceUser {

    @Autowired
    private IUserRepo userRepo;

    @Override
    public List<User> listAll() {
        return userRepo.findAll();
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }
}
