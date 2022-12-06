package com.uam.ecomerce.security;

import lombok.Data;

@Data
public class AuthCredential {
    private String email;
    private String password;
}
