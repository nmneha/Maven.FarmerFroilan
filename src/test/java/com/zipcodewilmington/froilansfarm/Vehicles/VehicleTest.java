package com.zipcodewilmington.froilansfarm.Vehicles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.testng.Assert;

class VehicleTest {

    @Test
    public void makeNoiseTest() {
        Aircraft airPlane = new Aircraft();
        String expected = "VROOM";
        String actual = airPlane.makeNoise();
        Assert.assertEquals(actual, expected);
    }

}