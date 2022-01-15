package com.sunglowsys.customer.service;

import com.sunglowsys.customer.domain.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    void update(Customer customer, Long id);
    List<Customer> findAll();
    Customer findById(Long id);
    void delete(Long id);
}
