package com.example.demo.controller;

import com.example.demo.model.Teacher;
import com.example.demo.teacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class teacherAPIController {

    @Autowired
    private teacherRepository teacherRepo;

    @PostMapping("teacher/new")
    public ResponseEntity<Teacher> newTeacher(Teacher teacher){
        Teacher s = teacherRepo.save(teacher);
        return new ResponseEntity(s, HttpStatus.OK);
    }

    @PutMapping("teacher/update/{id}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable Long id,
                                                 @RequestParam String user_name,
                                                 @RequestParam String name,
                                                 @RequestParam String pass_word){
        Teacher teacherToBeSaved = teacherRepo.findById(id);
        teacherToBeSaved.setUser_name(user_name);
        teacherToBeSaved.setName(name);
        teacherToBeSaved.setPass_word(pass_word);
        teacherRepo.save(teacherToBeSaved);
        return new ResponseEntity(teacherToBeSaved, HttpStatus.OK);
    }

}
