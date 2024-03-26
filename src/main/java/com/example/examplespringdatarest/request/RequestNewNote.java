package com.example.examplespringdatarest.request;

public class RequestNewNote {

    private int userId;

    private String title;

    private String textdata;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public RequestNewNote(int userId, String title, String textdata) {
        this.userId = userId;
        this.title = title;
        this.textdata = textdata;
    }
    public RequestNewNote() {
    }
}
