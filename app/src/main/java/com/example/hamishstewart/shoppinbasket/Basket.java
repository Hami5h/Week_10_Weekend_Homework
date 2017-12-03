package com.example.hamishstewart.shoppinbasket;

import com.example.hamishstewart.shoppinbasket.Behaviours.Buyable;
import com.example.hamishstewart.shoppinbasket.Products.Bread;

import java.util.ArrayList;

/**
 * Created by hamishstewart on 01/12/2017.
 */

public class Basket {

    private ArrayList<Buyable> goods;


    public Basket() {

        this.goods = new ArrayList<Buyable>();

    }


    public int itemCount() {
        return this.goods.size();
    }


    public void addItem(Buyable item) {
        this.goods.add(item);
    }

    public void removeItem(Buyable item) {
        this.goods.remove(item);
    }

    public void emptyBasket() {
        this.goods.clear();
    }

    public double totalCostBeforeDiscount() {
        double total = 0;
        for (Buyable item : goods) {
            total += item.totalCostPerItem();
        }
        return total;
    }

    public double totalCostWithBogofDiscount() {
        double total = 0;
        for (Buyable item : goods) {
            double cost = item.totalCostPerItemWithDiscount();
            total += cost;
        }
        return total;
    }

    public double totalCostWithTenPercentDiscount() {
        double total = 0;
        if (totalCostWithBogofDiscount() < 20.00) {
            total = totalCostWithBogofDiscount();
        } else {
            if (totalCostWithBogofDiscount() >= 20.00); {
                double discount = totalCostWithBogofDiscount() * 0.1;
                total = Math.round((totalCostWithBogofDiscount() - discount) * 100.0) / 100.0;
            }
        }
        return total;
    }

    public double totalCostWithTwoPercentLoyaltyDiscount() {
        double discount = totalCostWithTenPercentDiscount() * 0.02;
        double total = Math.round((totalCostWithTenPercentDiscount() - discount) * 100.0) / 100.0;
        return total;
    }

}
