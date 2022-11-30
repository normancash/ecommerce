package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Client;
import com.uam.ecomerce.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("serviceClient")
public class ImpServiceClient implements IServiceClient{

    @Autowired
    private IClientRepository repo;

    @Override
    public List<Client> listAll() {
        return repo.findAll();
    }

    @Override
    public Client save(Client client) {
        return repo.save(client);
    }

    @Override
    public void delete(Long id) {
         repo.deleteById(id);
    }

    @Override
    public Client findByNameLastName(String name, String lastName) {
        return repo.findClientByNameLastName(name,lastName);
    }
}
