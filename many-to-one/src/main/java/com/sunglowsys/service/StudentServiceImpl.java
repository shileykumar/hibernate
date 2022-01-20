package com.sunglowsys.service;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepository;
import com.sunglowsys.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentRepository repository = new StudentRepositoryImpl();

    @Override
    public void save(Student student) {
        repository.save(student);
    }

    @Override
    public void update(Student student, Long id) {
        repository.update(student,id);
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = repository.findAll();
        return studentList;
    }

    @Override
    public Student findById(Long id) {
        Student student = repository.findById(id);
        return student;
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
