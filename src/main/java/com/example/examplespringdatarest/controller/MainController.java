package com.example.examplespringdatarest.controller;


import com.example.examplespringdatarest.model.Note;
import com.example.examplespringdatarest.model.User;
import com.example.examplespringdatarest.repository.NoteRepository;
import com.example.examplespringdatarest.repository.UserRepository;
import com.example.examplespringdatarest.request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping("/user/all")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") int id) {
        return userRepository.findById(id);
    }

    @PostMapping("/user/create")
    public User addUser(@RequestBody RequestNewUser requestNewUser) {
        return userRepository.save(new User(requestNewUser.getUsername()));
    }

    @PutMapping("/edit-user")
    public User editUser(@RequestBody RequestEditUser editUser) {
        User user = userRepository.findById(editUser.getId());
        user.setUsername(editUser.getEditUsername());
        return userRepository.save(user);
    }

    @DeleteMapping("/user-delete")
    public void deleteUser(@RequestBody RequestDeleteUser deleteUser) {
        User user = userRepository.findById(deleteUser.getId());
        userRepository.delete(user);
    }

    @DeleteMapping("/user-delete/{userid}")
    public void deleteUser(@PathVariable(value = "userid") int id) {
        User user = userRepository.findById(id);
        userRepository.delete(user);
    }

    @GetMapping("/note/all")
    public List<Note> getAllNote() {
        return noteRepository.findAll();
    }

    @GetMapping("/note/{id}")
    public Note getNoteById(@PathVariable(value = "id") int id) {
        return noteRepository.findById(id);
    }

    @GetMapping("/user/{userid}/note")
    public List<Note> getAllNoteByUsersId(@PathVariable(value = "userid") int userId) {
        return noteRepository.findByUsersId(userId);
    }

    @PostMapping("/note/create")
    public Note createNote(@RequestBody RequestNewNote newNote){
        User user = userRepository.findById(newNote.getUserId());
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Note note = new Note(user,newNote.getTitle(), newNote.getTextdata(), timestamp, timestamp);
        return noteRepository.save(note);
    }

    @PutMapping("/edit-note")
    public Note editNote(@RequestBody RequestEditNote editNote) {
        Note note = noteRepository.findById(editNote.getId());
        User user = userRepository.findById(editNote.getUserId());
        note.setUsers(user);
        note.setTitle(editNote.getTitle());
        note.setTextdata(editNote.getTextdata());
        note.setDate_modif(new Timestamp(System.currentTimeMillis()));
        return noteRepository.save(note);
    }

    @DeleteMapping("/note-delete")
    public void deleteUser(@RequestBody RequestDeleteNote deleteNote) {
        Note note = noteRepository.findById(deleteNote.getId());
        noteRepository.delete(note);
    }

    @DeleteMapping("/note-delete/{noteid}")
    public void deleteNote(@PathVariable(value = "noteid") int id) {
        Note note = noteRepository.findById(id);
        noteRepository.delete(note);
    }
}