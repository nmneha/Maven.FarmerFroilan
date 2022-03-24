package com.zipcodewilmington.froilansfarm.Vehicles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

public class AircraftTest {

    @Test
    public void AircraftFlyTest() {
        Aircraft cropdust = new Aircraft();
        boolean actual = cropdust.fly();
        assertTrue(actual);
    }

    @Test
    public void makeNoiseTest() {
        Aircraft cropper = new Aircraft();
        String expected = "VROOM";
        String actual = cropper.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseFalseTest() {
        Aircraft cropper = new Aircraft();
        String expected = "BRAAAAP";
        String actual = cropper.makeNoise();
        Assert.assertNotEquals(expected, actual);
    }

}