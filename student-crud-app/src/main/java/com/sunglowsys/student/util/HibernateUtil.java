package com.sunglowsys.student.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory buildSessionFactory(){
        return new Configuration().configure().buildSessionFactory();
    }

    private static final SessionFactory factory = buildSessionFactory();

    public static SessionFactory getSessionFactory(){
        return factory;
    }

    public static void shutdown(){
         getSessionFactory().close();
    }

}
