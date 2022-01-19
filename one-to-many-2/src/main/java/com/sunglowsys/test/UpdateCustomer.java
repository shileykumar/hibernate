package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class UpdateCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setMobile(8527179124L);
        new CustomerServiceImpl().update(customer,2L);
    }
}
