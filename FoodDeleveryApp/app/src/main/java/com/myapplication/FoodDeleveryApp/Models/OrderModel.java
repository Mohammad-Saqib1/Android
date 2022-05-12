package com.myapplication.FoodDeleveryApp.Models;

public class OrderModel {
    public OrderModel() {

    }

    int orderImage;
    String soldItems,price,orderNumber;

    public int getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

    public String getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(String soldItems) {
        this.soldItems = soldItems;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderModel(int orderImage, String soldItems, String price, String orderNumber) {
        this.orderImage = orderImage;
        this.soldItems = soldItems;
        this.price = price;
        this.orderNumber = orderNumber;
    }
}
