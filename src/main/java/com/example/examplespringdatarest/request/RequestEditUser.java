package com.example.examplespringdatarest.request;

public class RequestEditUser {

    private int id;

    private String editUsername;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEditUsername() {
        return editUsername;
    }

    public void setEditUsername(String editUsername) {
        this.editUsername = editUsername;
    }

    public RequestEditUser(int id, String editUsername) {
        this.id = id;
        this.editUsername = editUsername;
    }

    public RequestEditUser(String editUsername) {
        this.editUsername = editUsername;
    }

    public RequestEditUser() {
    }
}
