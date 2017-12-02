package com.example.hamishstewart.shoppinbasket.Products;

import com.example.hamishstewart.shoppinbasket.Behaviours.Buyable;

/**
 * Created by hamishstewart on 01/12/2017.
 */

public class Bread extends Product implements Buyable {


    public Bread(String type, double price, int quantity) {
        super(type, price, quantity);
    }

//    @Override
//    public double totalCostPerItem() {
//        double cost = this.price * this.quantity;
//        return cost;
//    }

    public double totalCostPerItem() {
        int x = this.quantity;
        double cost = 0;
        if (x <= 1) {
            cost = this.price;
        } else {
            if (x >= 2) cost = this.price * this.quantity / 2;
        }

        return cost;

    }
}
