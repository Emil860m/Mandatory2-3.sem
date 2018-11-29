package com.example.demo;

import com.example.demo.model.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface teacherRepository extends CrudRepository<Teacher, Long> {
    List<Teacher> findAll();
    Teacher findById(Long id);
    Teacher deleteById(Long id);

}
