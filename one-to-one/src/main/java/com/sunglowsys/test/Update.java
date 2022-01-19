package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

public class Update {
    public static void main(String[] args) {
        Address address = new Address("Kasganj","UP","India",207123L);
        Employee employee = new Employee();
        employee.setMobile(920556533L);
        employee.setAddress(address);
        new EmployeeServiceImpl().update(employee,2L);
    }
}
