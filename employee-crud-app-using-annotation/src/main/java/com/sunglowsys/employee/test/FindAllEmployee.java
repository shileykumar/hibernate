package com.sunglowsys.employee.test;

import com.sunglowsys.employee.domain.Employee;
import com.sunglowsys.employee.service.EmployeeServiceImpl;

import java.util.List;

public class FindAllEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new EmployeeServiceImpl().findAll();
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
