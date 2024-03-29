package com.peluqueria.peluqueria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peluqueria.peluqueria.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {   
    public User findByName(String name);
}
