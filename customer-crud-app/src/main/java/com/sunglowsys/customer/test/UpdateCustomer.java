package com.sunglowsys.customer.test;

import com.sunglowsys.customer.domain.Customer;
import com.sunglowsys.customer.service.CustomerServiceImpl;

public class UpdateCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCity("Washington DC");
        new CustomerServiceImpl().update(customer,2L);
    }
}
