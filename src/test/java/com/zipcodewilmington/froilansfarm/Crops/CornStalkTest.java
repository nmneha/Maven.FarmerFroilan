package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CornStalkTest {
    Crop cornStalk = new CornStalk();
    @Test
    public void yieldEarCornTest() {
        cornStalk.yield();
        EarCorn.consumed();
        int actual = EarCorn.currentCount();
        Assert.assertEquals(0, actual);
    }


    @Test
    public void isfertilizedTest(){
        Assert.assertFalse(cornStalk.hasBeenFertilized());

    }

    @Test
    public void isHarvestedTest() {
        Assert.assertFalse(cornStalk.hasBeenHarvested());
    }

}