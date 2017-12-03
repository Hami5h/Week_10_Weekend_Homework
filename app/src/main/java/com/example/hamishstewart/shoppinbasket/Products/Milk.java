package com.example.hamishstewart.shoppinbasket.Products;

import com.example.hamishstewart.shoppinbasket.Behaviours.Buyable;

/**
 * Created by hamishstewart on 01/12/2017.
 */

public class Milk extends Product implements Buyable{


    public Milk(String type, double price, int quantity) {
        super(type, price, quantity);
    }

    @Override
    public double totalCostPerItem() {
        double cost = this.price * this.quantity;
        return cost;
    }

    @Override
    public double totalCostPerItemWithDiscount() {
        return totalCostPerItem();
    }
}
