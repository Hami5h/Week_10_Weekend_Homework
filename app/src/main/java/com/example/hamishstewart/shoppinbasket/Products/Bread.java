package com.example.hamishstewart.shoppinbasket.Products;

import com.example.hamishstewart.shoppinbasket.Behaviours.Buyable;
import com.example.hamishstewart.shoppinbasket.Behaviours.Discountable;

/**
 * Created by hamishstewart on 01/12/2017.
 */

public class Bread extends Product implements Buyable, Discountable {


    public Bread(String type, double price, int quantity) {
        super(type, price, quantity);
    }

    @Override
    public double totalCostPerItem() {
        double noDiscountCost = this.price * this.quantity;
        return noDiscountCost;
    }


    public double totalCostPerItemWithDiscount() {
//        int x = this.quantity;
//        double bogofCost = 0;
//        if (x <= 1) {
//            bogofCost = this.price;
//        } else {
//            if (x >= 2) bogofCost = this.price * this.quantity / 2;
//        }

        return totalCostPerItem() - totalBogofDiscount();
    }

    @Override
    public double totalBogofDiscount() {
        double discount = 0;
        if (this.quantity % 2 == 0) {
            discount = this.quantity * this.price / 2;
        } else {
            if (this.quantity >= 1 && this.quantity % 2 == 1) {
                discount = (((this.quantity -1) * this.price) / 2);
            }
        }
        return discount;
    }
}
