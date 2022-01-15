package com.sunglowsys.employee.test;

import com.sunglowsys.employee.domain.Employee;
import com.sunglowsys.employee.service.EmployeeServiceImpl;

public class Update {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setAddress("Washington DC");
        new EmployeeServiceImpl().update(employee,1L);
    }
}
