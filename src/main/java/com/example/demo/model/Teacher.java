package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Teacher extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @ManyToMany
    private ArrayList<Course> courses;

    public Teacher() {
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
