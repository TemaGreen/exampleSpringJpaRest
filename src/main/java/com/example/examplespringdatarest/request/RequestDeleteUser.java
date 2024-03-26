package com.example.examplespringdatarest.request;

public class RequestDeleteUser {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RequestDeleteUser(int id) {
        this.id = id;
    }

    public RequestDeleteUser() {
    }
}
