package com.sunglowsys.student.repository;

import com.sunglowsys.student.domain.Student;
import com.sunglowsys.student.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public void save(Student student) {
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try {
            transaction = session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();;
        }catch (Exception e){
            if(transaction == null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try{
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Student");
            studentList = query.list();
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        return studentList;
    }

    @Override
    public Student findById(Long id) {
        Student student = new Student();
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try {
            transaction = session.beginTransaction();
            student = session.get(Student.class,id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return student;
    }

    @Override
    public void update(Student student, Long id) {
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try {
            transaction = session.beginTransaction();
           Student student1 = session.get(Student.class,id);
            student1.setAddress(student.getAddress());
            session.update(student1);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        System.out.println("Updated---");
    }

    @Override
    public void delete(Long id) {
        Transaction transaction = null;
        Session session = sessionFactory.openSession();
        try {
            transaction = session.beginTransaction();
            Student student = session.get(Student.class,id);
            session.delete(student);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        System.out.println("Deleted---");
    }
}
