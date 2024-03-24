package com.example.TestCRUD.repository;


import com.example.TestCRUD.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


// No need implementation, just one interface, and you have CRUD, thanks Spring Data!

public interface StudentRepository extends MongoRepository<Student, String> {

}
