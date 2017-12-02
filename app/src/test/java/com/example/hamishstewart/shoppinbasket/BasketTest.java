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
        bread = new Bread("Hovis", 0.95, 1);
        milk = new Milk("Green", 1.30, 1);
        honey = new Honey("Solid", 3.20, 1);
    }

    @Test
    public void basketStartsEmpty(){
        assertEquals(0, basket.itemCount());
    }


}
