package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;

@Entity
public class Student extends User {
    //@ManyToMany
    private ArrayList<Course> courses;

    public Student() {
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
