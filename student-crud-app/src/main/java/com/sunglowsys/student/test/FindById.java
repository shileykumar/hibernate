package com.sunglowsys.student.test;

import com.sunglowsys.student.service.StudentService;
import com.sunglowsys.student.service.StudentServiceImpl;

public class FindById {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        System.out.println(studentService.findById(1L));
    }
}
