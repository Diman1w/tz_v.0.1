package com.example.TestCRUD.service;


import com.example.TestCRUD.model.Student;

import java.util.List;



public interface StudentService {
    List<Student> findAll();

    Student saveOrUpdateStudent(Student student);

}
