package com.example.demo.controller;

import com.example.demo.courseRepository;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class studentController {

    @Autowired
    private courseRepository courseRepo;
    @Autowired
    private studentRepository studentRepo;

    @GetMapping("/student/create")
    public String newStudent(Model m){
        m.addAttribute("student", new Student());
        List<Course> courses = courseRepo.findAll();
        m.addAttribute("courses", courses);
        return "studentNew";
    }

    @GetMapping("/student/edit/{id}")
    public String studentEditView(Model m, @PathVariable Long id) {
        Student s = studentRepo.findById(id);

        m.addAttribute("student", s);
        return "studentEdit";
    }

//    @GetMapping("/students")
//    public String studentView(Model m){
//        List<Student> students = studentRepo.findAll();
//        m.addAttribute("students", students);
//        return "students";
//    }
}
