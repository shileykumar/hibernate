package com.sunglowsys.employee.test;

import com.sunglowsys.employee.domain.Employee;
import com.sunglowsys.employee.service.EmployeeServiceImpl;

public class CreateEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("emma","smith","emma@gmail.com",986493646L,"development","New York");
        new EmployeeServiceImpl().save(employee);
    }
}
