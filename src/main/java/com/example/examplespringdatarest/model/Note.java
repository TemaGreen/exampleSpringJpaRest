package com.example.examplespringdatarest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;

@Entity
@Table(name="note")
public class Note {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "note_sequence")
    @SequenceGenerator(
            name = "note_sequence",
            allocationSize = 1
    )
    private int id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User users;

    @Column(name="title")
    private String title;

    @Column(name="textdata")
    private String textdata;

    @Column(name="date_modif")
    private Timestamp date_modif;

    @Column(name="date_create")
    private Timestamp date_create;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextdata() {
        return textdata;
    }

    public void setTextdata(String textdata) {
        this.textdata = textdata;
    }

    public Timestamp getDate_modif() {
        return date_modif;
    }

    public void setDate_modif(Timestamp date_modif) {
        this.date_modif = date_modif;
    }

    public Timestamp getDate_create() {
        return date_create;
    }

    public void setDate_create(Timestamp date_create) {
        this.date_create = date_create;
    }

    public Note(User users, String title, String textdata, Timestamp date_modif, Timestamp date_create) {
        this.users = users;
        this.title = title;
        this.textdata = textdata;
        this.date_modif = date_modif;
        this.date_create = date_create;
    }

    public Note(int id, User users, String title, String textdata, Timestamp date_modif, Timestamp date_create) {
        this.id = id;
        this.users = users;
        this.title = title;
        this.textdata = textdata;
        this.date_modif = date_modif;
        this.date_create = date_create;
    }

    public Note(int id, String title, String textdata, Timestamp date_modif, Timestamp date_create) {
        this.id = id;
        this.title = title;
        this.textdata = textdata;
        this.date_modif = date_modif;
        this.date_create = date_create;
    }


    public Note(String title, String textdata, Timestamp date_modif, Timestamp date_create) {
        this.title = title;
        this.textdata = textdata;
        this.date_modif = date_modif;
        this.date_create = date_create;
    }

    public Note() {
    }
}
