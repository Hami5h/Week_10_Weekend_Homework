package com.example.hamishstewart.shoppinbasket;

import com.example.hamishstewart.shoppinbasket.Behaviours.Buyable;
import com.example.hamishstewart.shoppinbasket.Products.Bread;
import com.example.hamishstewart.shoppinbasket.Products.Honey;
import com.example.hamishstewart.shoppinbasket.Products.Milk;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hamishstewart on 02/12/2017.
 */

public class ProductTest {
    Buyable bread;
    Buyable milk;
    Buyable honey;

    @Before
    public void before(){
        bread = new Bread("Hovis", 0.95, 2);
        milk = new Milk("Green", 1.30, 1);
        honey = new Honey("Solid", 3.20, 1);
    }

    @Test
    public void getTotalCostPerItem(){
        assertEquals(1.90, bread.totalCostPerItem(), 0.01);
    }

    @Test
    public void getBuyOneGetOneFreeDiscount() {
        assertEquals(0.95, bread.totalCostPerItem(), 0.01);
    }
}
