package com.sunglowsys.student.service;

import com.sunglowsys.student.domain.Student;
import com.sunglowsys.student.repository.StudentRepository;
import com.sunglowsys.student.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    StudentRepository studentRepository = new StudentRepositoryImpl();
    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    @Override
    public Student findById(Long id) {
        Student student = studentRepository.findById(id);
        if (student == null){
            System.out.println("Student is not available with id:"+id);
        }
        return student;
    }

    @Override
    public void update(Student student, Long id) {
        Student student1 = studentRepository.findById(id);
        if(student1 == null){
            System.out.println("Sorry! Student is not available with id:"+id);
        }
        else {
            studentRepository.update(student, id);
        }
    }

    @Override
    public void delete(Long id) {
        Student student = studentRepository.findById(id);
        if (student ==  null){
            try {
                throw new IllegalAccessException("Sorry! Student is not available with id:"+id);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        else {
            studentRepository.delete(id);
        }
    }
}
