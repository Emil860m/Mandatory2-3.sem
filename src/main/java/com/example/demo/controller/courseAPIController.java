package com.example.demo.controller;

import com.example.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
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
        Course course = new Course(name_eng, name_da, mandatory, ECTS, language, min_students, expected_students, max_students, prerequisites, learning_outcome, content, learning_activities, exam_form, teacher1, teacher2);

        Course courseToBeSaved = courseRepo.findById(id);
        courseToBeSaved.setName_eng(course.getName_eng());
        courseToBeSaved.setName_da(course.getName_da());
        courseToBeSaved.setMandatory(course.getMandatory());
        courseToBeSaved.setECTS(course.getECTS());
        courseToBeSaved.setLanguage(course.getLanguage());
        courseToBeSaved.setMin_students(course.getMin_students());
        courseToBeSaved.setExpected_students(course.getExpected_students());
        courseToBeSaved.setMax_students(course.getMax_students());
        courseToBeSaved.setPrerequisites(course.getPrerequisites());
        courseToBeSaved.setLearning_outcome(course.getLearning_outcome());
        courseToBeSaved.setContent(course.getContent());
        courseToBeSaved.setLearning_activities(course.getLearning_activities());
        courseToBeSaved.setExam_form(course.getExam_form());
        courseToBeSaved.setTeacher1(course.getTeacher1());
        courseToBeSaved.setTeacher2(course.getTeacher2());
        courseRepo.save(courseToBeSaved);
        return new ResponseEntity(courseToBeSaved, HttpStatus.OK);

    }

    @DeleteMapping("/course/delete/{id}")
    public ResponseEntity<Course> deleteCourse(@PathVariable Long id){
        Course course = courseRepo.findById(id);
        courseRepo.delete(id);
        return new ResponseEntity(course, HttpStatus.OK);
    }

}
