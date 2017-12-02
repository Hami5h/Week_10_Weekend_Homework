package com.example.hamishstewart.shoppinbasket.Products;

import com.example.hamishstewart.shoppinbasket.Behaviours.Buyable;

/**
 * Created by hamishstewart on 01/12/2017.
 */

public class Milk extends Product implements Buyable{


    public Milk(String type, double price, int quantity) {
        super(type, price, quantity);
    }
}
