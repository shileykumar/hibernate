package com.sunglowsys.student.test;

import com.sunglowsys.student.service.StudentServiceImpl;

public class DeleteStudent {
    public static void main(String[] args) {
        new StudentServiceImpl().delete(2L);
    }
}
