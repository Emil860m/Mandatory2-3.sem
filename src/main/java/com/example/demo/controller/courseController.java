package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.model.Study_programme;
import com.example.demo.model.Teacher;
import com.example.demo.study_programmeRepository;
import com.example.demo.teacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class courseController {

    @Autowired
    private teacherRepository teacherRepo;
    @Autowired
    private study_programmeRepository study_programmeRepo;

    @GetMapping("/course/create")
    public String createCourse(Model m){
        m.addAttribute("course", new Course());
        return "CourseNew";
    }
}
