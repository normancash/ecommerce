package com.uam.ecomerce.controller;

import com.uam.ecomerce.model.User;
import com.uam.ecomerce.service.IServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class ControllerUser {

    @Autowired
    private IServiceUser serviceUser;

    @GetMapping("list")
    public List<User> listAll(){
        return serviceUser.listAll();
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return serviceUser.save(user);
    }




}
