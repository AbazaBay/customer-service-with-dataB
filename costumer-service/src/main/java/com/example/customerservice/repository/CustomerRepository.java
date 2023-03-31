package com.example.customerservice.repository;

import com.example.customerservice.model.Customer;
import org.springframework.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
