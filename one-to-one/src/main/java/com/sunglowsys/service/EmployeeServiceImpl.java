package com.sunglowsys.service;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.repository.EmployeeRepository;
import com.sunglowsys.repository.EmployeeRepositoryImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void update(Employee employee, Long id) {
        employeeRepository.update(employee,id);
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    @Override
    public Employee findById(Long id) {
        Employee employee = employeeRepository.findById(id);
        return employee;
    }

    @Override
    public void delete(Long id) {
        employeeRepository.delete(id);
    }
}
