package com.example.hamishstewart.shoppinbasket;

import com.example.hamishstewart.shoppinbasket.Behaviours.Buyable;
import com.example.hamishstewart.shoppinbasket.Products.Bread;
import com.example.hamishstewart.shoppinbasket.Products.Honey;
import com.example.hamishstewart.shoppinbasket.Products.Milk;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 01/12/2017.
 */

public class BasketTest {
    Basket basket;
    Buyable bread;
    Buyable milk;
    Buyable honey;

    @Before
    public void before(){
        basket = new Basket();
        bread = new Bread("Hovis", 0.95, 5);
        milk = new Milk("Green", 1.30, 4);
        honey = new Honey("Solid", 3.20, 5);
    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void canAddBreadToBasket(){
        basket.addItem(bread);
        assertEquals(1, basket.itemCount());
    }

    @Test
    public void canAddMilkToBasket(){
        basket.addItem(milk);
        assertEquals(1, basket.itemCount());
    }

    @Test
    public void canAddHoneyToBasket(){
        basket.addItem(honey);
        assertEquals(1, basket.itemCount());
    }

    @Test
    public void canRemoveItemFromBasket(){
        basket.addItem(honey);
        assertEquals(1, basket.itemCount());
        basket.removeItem(honey);
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void canEmptyBasket(){
        basket.addItem(bread);
        basket.addItem(milk);
        basket.addItem(honey);
        assertEquals(3, basket.itemCount());
        basket.emptyBasket();
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void canGetTotalCostOfBasketBeforeDiscount(){
        basket.addItem(bread);
        basket.addItem(milk);
        basket.addItem(honey);
        assertEquals(25.95, basket.totalCostBeforeDiscount(), 0.01);
    }

    @Test
    public void canGetTotalCostWithBreadBogofDiscount(){
        basket.addItem(bread);
        basket.addItem(milk);
        basket.addItem(honey);
        assertEquals(24.05, basket.totalCostWithBogofDiscount(), 0.01);
    }

    @Test
    public void tenPercentDiscountNotApllicable() {
        basket.addItem(bread);
        basket.addItem(honey);
        assertEquals(18.85, basket.totalCostWithTenPercentDiscount(), 0.01);
    }

    @Test
    public void canGetTenPercentDiscount() {
        basket.addItem(bread);
        basket.addItem(milk);
        basket.addItem(honey);
        assertEquals(25.95, basket.totalCostBeforeDiscount(), 0.01);
        assertEquals(24.05, basket.totalCostWithBogofDiscount(), 0.01);
        assertEquals(21.645, basket.totalCostWithTenPercentDiscount(), 0.01);

    }



}
