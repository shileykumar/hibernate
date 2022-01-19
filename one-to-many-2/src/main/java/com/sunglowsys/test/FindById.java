package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.CustomerServiceImpl;

import java.util.List;

public class FindById {
    public static void main(String[] args) {
        Customer customer = new CustomerServiceImpl().findById(2L);
        System.out.println(customer.getId()+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getEmail()+" "+customer.getMobile());
        List<Order> orders = customer.getOrders();
        for (Order order : orders){
            System.out.println(order.getId()+" "+order.getAmount()+" "+order.getOrderDate());
        }
    }
}
