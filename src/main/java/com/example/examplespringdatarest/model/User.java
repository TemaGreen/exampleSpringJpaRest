package com.example.examplespringdatarest.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
    @SequenceGenerator(
            name = "users_sequence",
            allocationSize = 1
    )
    private int id;

    @Column(name="username")
    private String username;

    @OneToMany(mappedBy = "users")
    private List<Note> notes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(int id, String username, List<Note> notes) {
        this.id = id;
        this.username = username;
        this.notes = notes;
    }

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public User(String username) {
        this.username = username;
    }

    public User() {
    }
}
