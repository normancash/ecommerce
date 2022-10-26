package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.User;
import com.uam.ecomerce.service.IServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ControllerUser {

    @Autowired
    @Qualifier("serviceUser")
    private IServiceUser serviceUser;

    @GetMapping("list")
    private List<User> listAll(){
        return serviceUser.listAll();
    }

    @PostMapping("/save")
    private User save(@RequestBody User user) {
        return serviceUser.save(user);
    }

}
