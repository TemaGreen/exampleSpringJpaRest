package com.example.examplespringdatarest.repository;

import com.example.examplespringdatarest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findById(int id);
}
