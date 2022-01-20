package com.sunglowsys.service;

import com.sunglowsys.domain.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);
    void update(Student student, Long id);
    List<Student> findAll();
    Student findById(Long id);
    void delete(Long id);
}
