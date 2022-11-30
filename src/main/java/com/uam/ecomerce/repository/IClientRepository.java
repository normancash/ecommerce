package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IClientRepository extends JpaRepository<Client,Long> {

    @Query("select e from Client e where upper(e.firstName) = upper(:name) " +
            "and upper(e.lastName) = upper(:lastName)")
    public Client findClientByNameLastName(String name, String lastName);
}
