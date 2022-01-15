package com.sunglowsys.customer.test;

import com.sunglowsys.customer.domain.Customer;
import com.sunglowsys.customer.service.CustomerServiceImpl;

import java.util.List;

public class FindAllCustomer {
    public static void main(String[] args) {
        List<Customer> customerList = new CustomerServiceImpl().findAll();
        for (Customer customer : customerList){
            System.out.println(customer);
        }
    }
}
