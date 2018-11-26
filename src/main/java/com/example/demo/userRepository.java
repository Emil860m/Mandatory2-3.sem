package com.example.demo;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<User, Long> {
}
