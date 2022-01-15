package com.sunglowsys.customer.test;

import com.sunglowsys.customer.domain.Customer;
import com.sunglowsys.customer.service.CustomerServiceImpl;

public class CreateCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Emma","smith","emma@gmail.com",763497354L,"New York");
        new CustomerServiceImpl().save(customer);
    }
}
