package com.example.hamishstewart.shoppinbasket;

import com.example.hamishstewart.shoppinbasket.Behaviours.Buyable;

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
}
