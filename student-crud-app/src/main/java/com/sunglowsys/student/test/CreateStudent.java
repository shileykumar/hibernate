package com.sunglowsys.student.test;

import com.sunglowsys.student.domain.Student;
import com.sunglowsys.student.service.StudentService;
import com.sunglowsys.student.service.StudentServiceImpl;

public class CreateStudent {
    public static void main(String[] args) {
        Student student = new Student("shile", "kumar", "shilekumar@gmail.com", 9720556533L, "kasganj");
        Student student1 = new Student("john","smith","john@gmailc.com",964239446L,"New York");
        StudentService studentService = new StudentServiceImpl();
        studentService.save(student);
        studentService.save(student1);
    }
}
