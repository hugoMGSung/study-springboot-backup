package com.hugo83.sblog03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hugo83.sblog03.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}