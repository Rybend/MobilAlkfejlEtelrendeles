package com.example.hammarosan;

public class CartItem {
    private String name;
    private String price;

    public CartItem(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public CartItem() { }

    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
}
