package com.saqib.myapplication.Models;

public class PoetryModel {
    int id;

    public PoetryModel(int id, String poet_name, String poetry, String date_time) {
        this.id = id;
        this.poet_name = poet_name;
        this.poetry = poetry;
        this.date_time = date_time;
    }

    String poet_name;
    String poetry;
    String date_time;


    public String getPoet_name() {
        return poet_name;
    }

    public void setPoet_name(String poet_name) {
        this.poet_name = poet_name;
    }

    public String getPoetry() {
        return poetry;
    }

    public void setPoetry(String poetry) {
        this.poetry = poetry;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
