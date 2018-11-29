package com.example.demo;

import com.example.demo.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface courseRepository extends CrudRepository<Course, Long> {
    List<Course> findAll();
    Course findbyId(Long id);
    Course deleteById(Long id);
}
