package com.example.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootjpa.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}