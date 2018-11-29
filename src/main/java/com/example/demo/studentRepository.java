package com.example.demo;

import com.example.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface studentRepository extends CrudRepository<Student, Long> {
    List<Student> findAll();
    Student findById(Long id);

    Student deleteById(Long id);
}
