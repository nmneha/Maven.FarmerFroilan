package com.zipcodewilmington.froilansfarm.Vehicles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.testng.Assert;

class TractorTest {

    @Test
    public void operateTest() {
        Tractor tractor = new Tractor();
        boolean actual = tractor.operate();
        Assert.assertTrue(actual);

    }

}