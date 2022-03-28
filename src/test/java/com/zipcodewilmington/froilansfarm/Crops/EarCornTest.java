package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class EarCornTest {

    @Test
    public void EearCornTest() {
        EarCorn corn = new EarCorn();
        corn.harvested();
        corn.harvested();
        corn.consumed();
        Assert.assertEquals(1, corn.currentCount());
    }

    @Test
    public void consumedTest() {
        EarCorn corn = new EarCorn();
        corn.harvested();
        corn.harvested();
        corn.consumed();
        corn.consumed();
        corn.consumed();
        Assert.assertEquals(0, corn.currentCount());
    }

}