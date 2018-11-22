package model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name_eng;
    private String name_da;
    private String study_programme;//maybe arraylist for more than 1
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
    @ManyToMany
    private ArrayList<Teacher> teachers;
    @OneToMany
    private ArrayList<Student> students;

}
