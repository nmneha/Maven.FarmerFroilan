package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class EggTest {

    @Test
    public void EearCornTest() {
        Egg egg = new Egg();
        egg.harvested();
        egg.harvested();
        egg.consumed();
        Assert.assertEquals(1, egg.currentCount());
    }

    @Test
    public void consumedTest() {
        Egg egg = new Egg();
        egg.harvested();
        egg.harvested();
        egg.consumed();
        egg.consumed();
        egg.consumed();
        Assert.assertEquals(0, egg.currentCount());
    }

}