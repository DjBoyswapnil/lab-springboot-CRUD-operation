package com.example.demo.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.customer;

//import jakarta.persistence.Id;

public interface customerRepository extends JpaRepository<customer, Integer>
{

}
