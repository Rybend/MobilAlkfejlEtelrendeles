package com.example.hammarosan;

public class FoodItem {
    private String name;
    private String price;
    private int imageResource;

    public FoodItem(String name, String price, int imageResource) {
        this.name = name;
        this.price = price;
        this.imageResource = imageResource;
    }

    public FoodItem() { }

    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public int getImageResource() {
        return imageResource;
    }
}
