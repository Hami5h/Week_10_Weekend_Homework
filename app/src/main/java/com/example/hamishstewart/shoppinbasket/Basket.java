package com.example.hamishstewart.shoppinbasket;

import com.example.hamishstewart.shoppinbasket.Behaviours.Buyable;

import java.util.ArrayList;

/**
 * Created by hamishstewart on 01/12/2017.
 */

public class Basket {
    private String product;
    private double price;
    private int quantity;
    private ArrayList<Buyable> item;

    public Basket(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.item = new ArrayList<Buyable>();
    }


}
