package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentServiceImpl;

public class UpdateStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setEmail("shilekumar@gmail.com");
        new StudentServiceImpl().update(student,2L);
    }
}
