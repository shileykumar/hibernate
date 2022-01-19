package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;

import java.util.List;

public interface CustomerRepository {
    void save(Customer customer);
    void update(Customer customer, Long id);
    List<Customer> findAll();
    Customer findById(Long id);
    void delete(Long id);
}
