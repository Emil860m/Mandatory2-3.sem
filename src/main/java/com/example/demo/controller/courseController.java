package com.example.demo.controller;

import com.example.demo.courseRepository;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.studentRepository;
import com.example.demo.study_programmeRepository;
import com.example.demo.teacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.example.demo.controller.courseAPIController.courseId;

@Controller
public class courseController {
    private Long courseId;

    @Autowired
    private teacherRepository teacherRepo;
    @Autowired
    private study_programmeRepository study_programmeRepo;
    @Autowired
    private courseRepository courseRepo;
    @Autowired
    private studentRepository studentRepo;

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

    @GetMapping("/course/{id}/addstudents")
    public String addStudentsToCourse(Model m, @PathVariable Long id){
        courseId = id;
        Course c = courseRepo.findById(id);
        m.addAttribute("course", c);
        List<Student> students = studentRepo.findAll();
        m.addAttribute("students", students);
        return "addStudentsToCourse";
    }

    @PostMapping("/course/addStudents")
    public ResponseEntity<Course> addStudent(@RequestParam ArrayList<Student> students){

        Course course = courseRepo.findById(courseId);
        course.setStudents(students);
        courseRepo.save(course);

        return new ResponseEntity<>(course, HttpStatus.OK);
    }

}
