package com.sunglowsys.student.repository;

import com.sunglowsys.student.domain.Student;

import java.util.List;

public interface StudentRepository {
    void save(Student student);
    List<Student> findAll();
    Student findById(Long id);
    void update(Student student, Long id);
    void delete(Long id);
}
