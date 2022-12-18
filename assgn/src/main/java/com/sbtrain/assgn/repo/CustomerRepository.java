package com.sbtrain.assgn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbtrain.assgn.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
