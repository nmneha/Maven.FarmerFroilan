package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CornStalkTest {
    Crop cornStalk = new CornStalk();
    @Test
    public void yieldEarCornTest() {
        EarCorn corn = new EarCorn();
        cornStalk.yield(corn);
        int actual = corn.currentCount();
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