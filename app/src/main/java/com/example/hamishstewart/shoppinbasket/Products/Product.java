package com.example.hamishstewart.shoppinbasket.Products;

/**
 * Created by hamishstewart on 02/12/2017.
 */

public class Product {
    private String type;
    private double price;
    private int quantity;

    public Product(String type, double price, int quantity) {
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
