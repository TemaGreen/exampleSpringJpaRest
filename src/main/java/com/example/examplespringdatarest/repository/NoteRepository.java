package com.example.examplespringdatarest.repository;

import com.example.examplespringdatarest.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Integer> {

    Note findById(int id);

    List<Note> findByUsersId(int id);
}
