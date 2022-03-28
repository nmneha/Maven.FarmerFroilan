package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CropTest {

    @Test
    void yield() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.yield();
        int expected = 0;
        int actual = EarCorn.currentCount();
        Assert.assertEquals(expected, actual);
    }
}