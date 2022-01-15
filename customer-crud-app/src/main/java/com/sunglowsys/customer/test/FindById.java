package com.sunglowsys.customer.test;

import com.sunglowsys.customer.domain.Customer;
import com.sunglowsys.customer.service.CustomerServiceImpl;

public class FindById {
    public static void main(String[] args) {
        Customer customer = new CustomerServiceImpl().findById(3L);
        System.out.println(customer);
    }
}
