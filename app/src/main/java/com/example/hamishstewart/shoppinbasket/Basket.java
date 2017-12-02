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

    public double totalCostWithBreadBogofDiscount() {
        double total = 0;
        for (Buyable item : goods) {
            double cost = item.totalCostPerItem();
            total += cost;
        }
        return total;
    }

}
