package com.sunglowsys.customer.service;

import com.sunglowsys.customer.domain.Customer;
import com.sunglowsys.customer.repository.CustomerRepository;
import com.sunglowsys.customer.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void update(Customer customer, Long id) {
        customerRepository.update(customer,id);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = customerRepository.findAll();
        if (customerList == null){
            System.out.println("Sorry! data not available--");
        }
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        Customer customer = customerRepository.findById(id);
        if (customer == null){
            System.out.println("Data is not available for id:"+id);
        }
        return customer;
    }

    @Override
    public void delete(Long id) {
        customerRepository.delete(id);
    }
}
