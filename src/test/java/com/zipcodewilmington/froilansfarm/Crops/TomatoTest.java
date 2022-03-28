package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TomatoTest {

    @Test
    public void TomatoTest() {
        Tomato tomato = new Tomato();
        tomato.harvested();
        tomato.harvested();
        tomato.consumed();
        Assert.assertEquals(1, tomato.currentCount());
    }

    @Test
    public void consumedTest() {
        Tomato tomato = new Tomato();
        tomato.harvested();
        tomato.harvested();
        tomato.consumed();
        tomato.consumed();
        tomato.consumed();
        Assert.assertEquals(0, tomato.currentCount());
    }

}