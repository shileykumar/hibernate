package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class CreateCustomer {
    public static void main(String[] args) {
        Order order = new Order(2500.0,"18-01-2022");
        Order order1 = new Order(3000.0,"17-01-2022");
        List<Order> orders = new ArrayList<>();
        orders.add(order);
        orders.add(order1);
        Customer customer = new Customer("shiley","kumar","shileykumar@gmail.com",9720556533L,orders);
        new CustomerServiceImpl().save(customer);
    }
}
