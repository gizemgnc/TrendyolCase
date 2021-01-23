package com.trendyol.demo.models;

public class Product {
    private int id;
    private String name;
    private int categoryId;
    private String color;
    private Double price;
    private String description;

    public Product(int id, String name, int categoryId, String color, Double price, String description) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.color = color;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
