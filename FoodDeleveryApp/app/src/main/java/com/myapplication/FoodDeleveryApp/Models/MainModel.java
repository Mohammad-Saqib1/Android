package com.myapplication.FoodDeleveryApp.Models;

public class MainModel {

    int pic;
    String name,price,description;

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MainModel(int pic, String name, String price, String description) {
        this.pic = pic;
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
