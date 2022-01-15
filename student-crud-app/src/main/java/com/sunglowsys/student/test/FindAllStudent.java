package com.sunglowsys.student.test;

import com.sunglowsys.student.domain.Student;
import com.sunglowsys.student.service.StudentService;
import com.sunglowsys.student.service.StudentServiceImpl;

import java.util.List;

public class FindAllStudent {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        List<Student> studentList = studentService.findAll();
        for (Student student : studentList){
            System.out.println(student);
        }
    }
}
