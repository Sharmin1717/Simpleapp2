package com.example.simpleapp2;

public class Product {
    private String name;
    private String description;
    private int imageId;
    private double price;

    public Product(String name, String description, int imageId, double price) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    public double getPrice() {
        return price;
    }
}
