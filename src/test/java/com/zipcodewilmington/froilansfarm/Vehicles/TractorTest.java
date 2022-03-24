package com.zipcodewilmington.froilansfarm.Vehicles;

import org.junit.Test;
import org.testng.Assert;

class TractorTest {

    @Test
    public void operateTest() {
        Tractor tractor = new Tractor();
        boolean actual = tractor.operate();
        Assert.assertTrue(actual);

    }

    @Test
    public void makeNoiseTest() {
        Tractor johnDeere = new Tractor();
        String expected = "GLUG GLUG";
        String actual = johnDeere.makeNoise();
        Assert.assertEquals(actual, expected);

    }

}