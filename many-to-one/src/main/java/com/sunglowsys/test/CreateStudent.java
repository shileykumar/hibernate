package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.domain.Subject;
import com.sunglowsys.service.StudentServiceImpl;

public class CreateStudent {
    public static void main(String[] args) {
        StudentServiceImpl service = new StudentServiceImpl();
        Subject subject = new Subject("Math","M101");

        Student student = new Student("Shiley","Kumar","shilekmar@gmail.com",subject);
        Student student1 = new Student("Shile","kumar","shile@gmail.com",subject);

        service.save(student);
        service.save(student1);
    }
}
