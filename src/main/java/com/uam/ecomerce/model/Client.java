package com.uam.ecomerce.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Data
public class Client {

    @Id
    @SequenceGenerator(name = "client_seq",
            sequenceName = "client_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "client_seq")
    private Long id;

    private String firstName;

    private String secondName;

    private String lastName;

    private String telephone;

    private String address;

    @Email
    private String email;


}
