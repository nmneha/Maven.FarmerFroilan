package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CornStalkTest {
    Crop cornStalk = new CornStalk();
    @Test
    public void yieldEarCornTest() {
        //given
        Crop cornStalk = new CornStalk();

    }
    @Test
    public void isfertilizedTest(){
        Assert.assertFalse(cornStalk.isFertilized());

    }

    @Test
    public void isHarvestedTest() {
        Assert.assertFalse(cornStalk.isHarvested());
    }

}