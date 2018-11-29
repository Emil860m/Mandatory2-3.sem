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
                                               @RequestParam String learning_activities,
                                               @RequestParam String exam_form,
                                               @RequestParam String teacher1,
                                               @RequestParam String teacher2){
        Course courseToBeSaved = courseRepo.findById(id);
        courseToBeSaved.setName_eng(name_eng);
        courseToBeSaved.setName_da(name_da);
        courseToBeSaved.setMandatory(mandatory);
        courseToBeSaved.setECTS(ECTS);
        courseToBeSaved.setLanguage(language);
        courseToBeSaved.setMin_students(min_students);
        courseToBeSaved.setExpected_students(expected_students);
        courseToBeSaved.setMax_students(max_students);
        courseToBeSaved.setPrerequisites(prerequisites);
        courseToBeSaved.setLearning_outcome(learning_outcome);
        courseToBeSaved.setContent(content);
        courseToBeSaved.setLearning_activities(learning_activities);
        courseToBeSaved.setExam_form(exam_form);
        courseToBeSaved.setTeacher1(teacher1);
        courseToBeSaved.setTeacher2(teacher2);
        courseRepo.save(courseToBeSaved);
        return new ResponseEntity(courseToBeSaved, HttpStatus.OK);

    }
    @DeleteMapping("/course/delete/{id}")
    public void deleteCourse(@PathVariable Long id){
        courseRepo.deleteById(id);
    }

}
