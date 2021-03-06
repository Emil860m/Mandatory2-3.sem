package com.example.demo.controller;

import com.example.demo.courseRepository;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.studentRepository;
import com.example.demo.teacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class teacherController {

    @Autowired
    private courseRepository courseRepo;
    @Autowired
    private teacherRepository teacherRepo;

    @GetMapping("/teacher/new")
    public String newTeacher(Model m){
        m.addAttribute("teacher", new Teacher());
        List<Course> courses = courseRepo.findAll();
        m.addAttribute("courses", courses);
        return "teacherNew";
    }

    @GetMapping("/teacher/edit/{id}")
    public String teacherEditView(Model m, @PathVariable Long id) {
        Teacher t = teacherRepo.findById(id);
        m.addAttribute("teacher", t);
        return "teacherEdit";
    }

    @GetMapping("/teachers")
    public String teacherView(Model m){
        List<Teacher> teachers = teacherRepo.findAll();
        m.addAttribute("teachers", teachers);
        return "teachers";
    }


}
