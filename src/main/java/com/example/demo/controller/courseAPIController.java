package com.example.demo.controller;

import com.example.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @PutMapping("/course/update/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable Long id,
                                               @RequestParam String name_eng,
                                               @RequestParam String name_da,
                                               @RequestParam Boolean mandatory,
                                               @RequestParam Integer ECTS,
                                               @RequestParam String language,
                                               @RequestParam Integer min_students,
                                               @RequestParam Integer expected_students,
                                               @RequestParam Integer max_students,
                                               @RequestParam String prerequisites,
                                               @RequestParam String learning_outcome,
                                               @RequestParam String content,
                                               @RequestParam String ){


    }

}
