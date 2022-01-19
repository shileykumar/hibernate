package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Customer customer) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
        session.close();
        System.out.println("created---");
    }

    @Override
    public void update(Customer customer, Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Customer customer1 = session.get(Customer.class,id);
        customer1.setMobile(customer.getMobile());
        session.update(customer1);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();
        session.close();
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        Session session = sessionFactory.openSession();
        Customer customer = session.get(Customer.class, id);
        session.close();
        return customer;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Customer customer = session.get(Customer.class,id);
        session.delete(customer);
        session.getTransaction().commit();
        session.close();
    }
}
