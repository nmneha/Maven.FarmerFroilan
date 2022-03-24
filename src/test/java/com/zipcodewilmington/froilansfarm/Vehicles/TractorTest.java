package com.zipcodewilmington.froilansfarm.Vehicles;

import org.junit.Test;
import org.testng.Assert;

public class TractorTest {

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
    @Test
    public void makeNoiseFalseTest() {
        Tractor johnDeere = new Tractor();
        String expected = "CHUG CHUG";
        String actual = johnDeere.makeNoise();
        Assert.assertNotEquals(actual, expected);

    }

}