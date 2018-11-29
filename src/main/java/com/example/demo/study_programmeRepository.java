package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.model.Study_programme;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface study_programmeRepository extends CrudRepository<Study_programme, Long> {
    List<Study_programme> findAll();
}
