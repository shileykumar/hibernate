package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Student student) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Student student, Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Student student1 = session.get(Student.class,id);
        student1.setEmail(student.getEmail());
        session.update(student1);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Student> findAll() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Student");
        List<Student> studentList = query.list();
        session.close();
        return studentList
                ;
    }

    @Override
    public Student findById(Long id) {
        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class,id);
        session.close();
        return student;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Student student = session.get(Student.class,id);
        session.delete(student);
        session.getTransaction().commit();
        session.close();
    }
}
