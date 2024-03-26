package com.example.examplespringdatarest.request;

public class RequestNewUser {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RequestNewUser(String username) {
        this.username = username;
    }

    public RequestNewUser() {
    }
}
