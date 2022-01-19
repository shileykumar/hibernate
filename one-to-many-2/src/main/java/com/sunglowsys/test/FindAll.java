package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.CustomerServiceImpl;

import java.util.List;

public class FindAll {
    public static void main(String[] args) {
        List<Customer> customerList = new CustomerServiceImpl().findAll();
        for (Customer customer : customerList){
            System.out.println("Customer details----");
            System.out.println(customer.getId()+" "+customer.getFirstName()+" "+customer.getLastName()+" "+customer.getEmail()+" "+customer.getMobile());
            System.out.println("Order details---");

            List<Order> orders = customer.getOrders();
            for (Order order : orders){
                System.out.println(order.getId()+" "+order.getAmount()+" "+order.getOrderDate());
            }
        }
    }
}
