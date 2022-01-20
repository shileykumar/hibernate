package com.sunglowsys.test;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.service.SubjectServiceImpl;

public class FindSubjectById {
    public static void main(String[] args) {
        Subject subject = new SubjectServiceImpl().findById(1L);
        System.out.println(subject);
    }
}
