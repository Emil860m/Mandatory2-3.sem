package com.example.demo.controller;

import com.example.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.courseRepository;

@RestController
public class courseAPIController {
    @Autowired
    private courseRepository courseRepo;

    @PostMapping("/course/new")
    public ResponseEntity<Course> newCourse(Course course){
        Course c = courseRepo.save(course);
        return new ResponseEntity(course, HttpStatus.OK);
    }
}
