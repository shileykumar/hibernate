package com.sunglowsys.test;

import com.sunglowsys.service.StudentServiceImpl;

public class DeleteStudent {
    public static void main(String[] args) {
        new StudentServiceImpl().delete(2L);
    }
}
