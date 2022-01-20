package com.sunglowsys.repository;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class SubjectRepositoryImpl implements SubjectRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void save(Subject subject) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(subject);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Subject subject, Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Subject subject1 = session.get(Subject.class,id);
        subject1.setName(subject.getName());
        session.update(subject1);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Subject> findAll() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Subject");
        List<Subject> subjects = query.list();
        session.close();
        return subjects;
    }

    @Override
    public Subject findById(Long id) {
        Session session = sessionFactory.openSession();
        Subject subject = session.get(Subject.class,id);
        session.close();
        return subject;
    }

    @Override
    public void delete(Long id) {

    }
}
