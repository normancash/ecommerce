package com.uam.ecomerce.repository;

import com.uam.ecomerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IUserRepo extends JpaRepository<User, UUID> {

     Optional<User> findOneByEmail(String email);
}
