package com.sunglowsys.test;

import com.sunglowsys.service.CustomerServiceImpl;

public class DeleteCustomer {
    public static void main(String[] args) {
        new CustomerServiceImpl().delete(3L);
    }
}
