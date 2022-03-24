package com.zipcodewilmington.froilansfarm.Vehicles;

import org.junit.Test;
import org.testng.Assert;

public class VehicleTest {

    @Test
    public void makeNoiseTest() {
        Aircraft airPlane = new Aircraft();
        String expected = "VROOM";
        String actual = airPlane.makeNoise();
        Assert.assertEquals(actual, expected);
    }

}