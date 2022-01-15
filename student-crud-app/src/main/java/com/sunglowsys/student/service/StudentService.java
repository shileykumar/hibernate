package com.sunglowsys.student.service;

import com.sunglowsys.student.domain.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);
    List<Student> findAll();
    Student findById(Long id);
    void update(Student student, Long id);
    void delete(Long id);
}
