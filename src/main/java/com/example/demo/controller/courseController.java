package com.example.demo.controller;

import com.example.demo.courseRepository;
import com.example.demo.model.Course;
import com.example.demo.study_programmeRepository;
import com.example.demo.teacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class courseController {

    @Autowired
    private teacherRepository teacherRepo;
    @Autowired
    private study_programmeRepository study_programmeRepo;
    @Autowired
    private courseRepository courseRepo;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/course/new")
    public String createCourse(Model m){
        m.addAttribute("course", new Course());
        return "CourseNew";
    }

    @GetMapping("/course/edit/{id}")
    public String courseEdit(Model m, @PathVariable Long id){
        Course c = courseRepo.findById(id);
        m.addAttribute("course", c);
        return "courseEdit";
    }

    @GetMapping("/course")
    public String courses(Model m){
        List<Course> courses = courseRepo.findAll();
        m.addAttribute("courses", courses);
        return "courses";
    }
    @GetMapping("/course/{id}")
    public String course(Model m, @PathVariable Long id){
        Course c = courseRepo.findById(id);
        m.addAttribute("course", c);
        return "courseDetails";
    }



}
