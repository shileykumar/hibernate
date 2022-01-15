package com.sunglowsys.customer.test;

import com.sunglowsys.customer.service.CustomerServiceImpl;

public class DeleteCustomer {
    public static void main(String[] args) {
        new CustomerServiceImpl().delete(2L);
    }
}
