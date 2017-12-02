package com.example.hamishstewart.shoppinbasket;

import com.example.hamishstewart.shoppinbasket.Products.Bread;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 02/12/2017.
 */

public class BreadTest {
    Bread bread;

    @Before
    public void before() {
        bread = new Bread("Hovis", 0.95, 2);
    }

    @Test
    public void canGetType() {
        assertEquals("Hovis", bread.getType());
    }

    @Test
    public void canGetPrice() {
        assertEquals(0.95, bread.getPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(2, bread.getQuantity());
    }

}
