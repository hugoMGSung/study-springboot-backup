package com.example.springbootweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootweb.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}
