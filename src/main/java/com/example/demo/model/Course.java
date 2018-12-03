package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name_eng;
    private String name_da;
    private ArrayList<String> study_programme;
    private boolean mandatory;
    private int ECTS;
    private String language;
    private int min_students;
    private int expected_students;
    private int max_students;
    private String prerequisites;
    private String learning_outcome;
    private String content;
    private String learning_activities;
    private String exam_form;
    private String teacher2;
    private String teacher1;
    //@ManyToMany
    private ArrayList<Student> students;

    public Course() {
    }

    public Course(String name_eng, String name_da, boolean mandatory, int ECTS, String language, int min_students, int expected_students, int max_students, String prerequisites, String learning_outcome, String content, String learning_activities, String exam_form, String teacher1, String teacher2) {
        this.name_eng = name_eng;
        this.name_da = name_da;
       // this.study_programme = study_programme;
        this.mandatory = mandatory;
        this.ECTS = ECTS;
        this.language = language;
        this.min_students = min_students;
        this.expected_students = expected_students;
        this.max_students = max_students;
        this.prerequisites = prerequisites;
        this.learning_outcome = learning_outcome;
        this.content = content;
        this.learning_activities = learning_activities;
        this.exam_form = exam_form;
        this.teacher1 = teacher1;
        this.teacher2 = teacher2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_eng() {
        return name_eng;
    }

    public void setName_eng(String name_eng) {
        this.name_eng = name_eng;
    }

    public String getName_da() {
        return name_da;
    }

    public void setName_da(String name_da) {
        this.name_da = name_da;
    }

    public ArrayList<String> getStudy_programme() {
        return study_programme;
    }

    public void setStudy_programme(ArrayList<String> study_programme) {
        this.study_programme = study_programme;
    }

    public boolean getMandatory() {
        return mandatory;
    }


    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getMin_students() {
        return min_students;
    }

    public void setMin_students(int min_students) {
        this.min_students = min_students;
    }

    public int getExpected_students() {
        return expected_students;
    }

    public void setExpected_students(int expected_students) {
        this.expected_students = expected_students;
    }

    public int getMax_students() {
        return max_students;
    }

    public void setMax_students(int max_students) {
        this.max_students = max_students;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getLearning_outcome() {
        return learning_outcome;
    }

    public void setLearning_outcome(String learning_outcome) {
        this.learning_outcome = learning_outcome;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLearning_activities() {
        return learning_activities;
    }

    public void setLearning_activities(String learning_activities) {
        this.learning_activities = learning_activities;
    }

    public String getExam_form() {
        return exam_form;
    }

    public void setExam_form(String exam_form) {
        this.exam_form = exam_form;
    }

    public String getTeacher2() {
        return teacher2;
    }

    public void setTeacher2(String teacher2) {
        this.teacher2 = teacher2;
    }

    public String getTeacher1() {
        return teacher1;
    }

    public void setTeacher1(String teacher1) {
        this.teacher1 = teacher1;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
