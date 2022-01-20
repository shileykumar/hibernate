package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentServiceImpl;

public class FindStudentById {
    public static void main(String[] args) {
        Student student = new StudentServiceImpl().findById(2L);
        System.out.println(student.getId()+" "+student.getFirstName()+" "+student.getLastName()+" "+student.getEmail());
        System.out.println(student.getSubject().getId()+" "+student.getSubject().getName()+" "+student.getSubject().getCode());
    }
}
