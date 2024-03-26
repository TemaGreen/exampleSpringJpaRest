package com.example.examplespringdatarest.request;

public class RequestDeleteNote {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RequestDeleteNote(int id) {
        this.id = id;
    }

    public RequestDeleteNote() {
    }
}
