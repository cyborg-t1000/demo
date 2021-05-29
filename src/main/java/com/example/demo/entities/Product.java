package com.example.demo.entities;

public class Product {
    private int id;
    private String title;
    private float cost;

    public Product(Integer id, String title, Float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Float getCost() {
        return cost;
    }
}
