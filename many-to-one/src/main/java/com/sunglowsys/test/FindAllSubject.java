package com.sunglowsys.test;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.service.SubjectServiceImpl;

import java.util.List;

public class FindAllSubject {
    public static void main(String[] args) {
        List<Subject> subjects = new SubjectServiceImpl().findAll();
        for (Subject subject : subjects){
            System.out.println(subject);
        }
    }
}
