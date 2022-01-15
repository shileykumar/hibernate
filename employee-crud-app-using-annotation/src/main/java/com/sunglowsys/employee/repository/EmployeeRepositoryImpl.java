package com.sunglowsys.employee.repository;

import com.sunglowsys.employee.domain.Employee;
import com.sunglowsys.employee.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Employee employee, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee1 = session.get(Employee.class,id);
        employee1.setAddress(employee.getAddress());
        session.update(employee1);
        session.getTransaction().commit();
        session.close();
        System.out.println("Updated---");
    }

    @Override
    public List<Employee> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Employee");
        List<Employee> employeeList = query.list();
        return employeeList;
    }

    @Override
    public Employee findById(Long id) {
        Session session = sessionFactory.openSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class,id);
        session.delete(employee);
        session.getTransaction().commit();
        session.close();
        System.out.println("deleted----");
    }
}
