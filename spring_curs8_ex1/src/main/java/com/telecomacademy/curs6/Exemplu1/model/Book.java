package com.telecomacademy.curs6.Exemplu1.model;

public class Book {
    private String id;
    private String title;
    private String price;

    public Book() {
    }

    public Book(String title, String price) {
        this.title = title;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
