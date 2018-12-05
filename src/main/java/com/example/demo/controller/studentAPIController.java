package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.studentRepository;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class studentAPIController {

    @Autowired
    private studentRepository studentRepo;

    @PostMapping("/student/new")
    public ResponseEntity<Student> newStudent(Student student){
        Student s = studentRepo.save(student);
        return new ResponseEntity(s, HttpStatus.OK);
    }

    @PutMapping("/student/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id,
                                         @RequestParam String user_name,
                                         @RequestParam String name,
                                         @RequestParam String pass_word) {
        Student studentToBeUpdated = studentRepo.findById(id);
        studentToBeUpdated.setUser_name(user_name);
        studentToBeUpdated.setName(name);
        studentToBeUpdated.setPass_word(pass_word);
        studentRepo.save(studentToBeUpdated);
        return new ResponseEntity(studentToBeUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/student/delete/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable Long id){
        Student student = studentRepo.findById(id);
        studentRepo.delete(id);
        return new ResponseEntity(student, HttpStatus.OK);
    }

}
