package com.sunglowsys.service;

import com.sunglowsys.domain.Employee;

import java.util.List;

public interface EmployeeService {
    void save(Employee employee);
    void update(Employee employee,Long id);
    List<Employee> findAll();
    Employee findById(Long id);
    void delete(Long id);
}
