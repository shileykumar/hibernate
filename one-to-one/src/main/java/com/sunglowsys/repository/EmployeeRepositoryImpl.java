package com.sunglowsys.repository;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Employee;
import com.sunglowsys.util.HibernateUtil;
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
        System.out.println("created---");
    }

    @Override
    public void update(Employee employee, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee1 = session.get(Employee.class,id);

        Address address = session.get(Address.class,id);

        address.setCity(employee.getAddress().getCity());
        address.setState(employee.getAddress().getState());
        address.setCountry(employee.getAddress().getCountry());
        address.setZipcode(employee.getAddress().getZipcode());

        employee1.setAddress(address);
        employee1.setMobile(employee.getMobile());

        session.update(employee1);

        session.getTransaction().commit();
        session.close();
        System.out.println("Updated----");
    }

    @Override
    public List<Employee> findAll() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Employee");
        List<Employee> employeeList = query.list();
        session.close();
        return employeeList;
    }

    @Override
    public Employee findById(Long id) {
        Session session = sessionFactory.openSession();
        Employee employee = session.get(Employee.class,id);
        session.close();
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
        System.out.println("deleted-----");
    }
}
