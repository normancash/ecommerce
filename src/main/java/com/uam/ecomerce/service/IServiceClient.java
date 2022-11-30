package com.uam.ecomerce.service;

import com.uam.ecomerce.model.Client;

import java.util.List;

public interface IServiceClient {


    public List<Client> listAll();

    public Client save(Client client);

    public void delete(Long id);

    public Client findByNameLastName(String name,String lastName);
}
