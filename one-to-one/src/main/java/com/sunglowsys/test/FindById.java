package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

public class FindById {
    public static void main(String[] args) {
        Employee employee = new EmployeeServiceImpl().findById(2L);
        System.out.println(employee);
    }
}
