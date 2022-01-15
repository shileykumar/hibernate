package com.sunglowsys.employee.test;

import com.sunglowsys.employee.service.EmployeeServiceImpl;

public class DeleteEmployeeById {
    public static void main(String[] args) {
        new EmployeeServiceImpl().delete(2L);
    }
}
