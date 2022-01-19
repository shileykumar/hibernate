package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

public class CreateEmployee {
    public static void main(String[] args) {
        Address address = new Address("Noida","UP","India",2071208L);
        Employee employee = new Employee("Shiley","kumar","shileykumar@gmail.com",9720556533L);
        employee.setAddress(address);
        new EmployeeServiceImpl().save(employee);
    }
}
