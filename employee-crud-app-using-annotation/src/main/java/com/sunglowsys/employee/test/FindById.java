package com.sunglowsys.employee.test;

import com.sunglowsys.employee.repository.EmployeeRepositoryImpl;

public class FindById {
    public static void main(String[] args) {
        System.out.println(new EmployeeRepositoryImpl().findById(2L));
    }
}
