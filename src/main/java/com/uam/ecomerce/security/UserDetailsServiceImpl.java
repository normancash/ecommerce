package com.uam.ecomerce.security;

import com.uam.ecomerce.model.User;
import com.uam.ecomerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user =  repo.findOneByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new UserDetailsImp(user);
    }


}
