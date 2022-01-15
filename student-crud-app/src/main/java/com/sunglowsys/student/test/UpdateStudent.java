package com.sunglowsys.student.test;

import com.sunglowsys.student.domain.Student;
import com.sunglowsys.student.service.StudentService;
import com.sunglowsys.student.service.StudentServiceImpl;

public class UpdateStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAddress("Washington DC");
        new StudentServiceImpl().update(student,3L);
    }
}
