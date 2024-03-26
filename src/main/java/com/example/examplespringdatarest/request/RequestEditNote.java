package com.example.examplespringdatarest.request;

public class RequestEditNote {

    private int id;

    private int userId;

    private String title;

    private String textdata;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public RequestEditNote(int id, int userId, String title, String textdata) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.textdata = textdata;
    }

    public RequestEditNote() {
    }
}
