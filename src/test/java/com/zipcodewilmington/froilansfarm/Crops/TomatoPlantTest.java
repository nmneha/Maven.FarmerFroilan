package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TomatoPlantTest {
    Crop tomatoPlant = new TomatoPlant();
    Tomato tomato = new Tomato();

    @Test
    public void isfertilizedTest(){
        Assert.assertFalse(tomatoPlant.hasBeenFertilized());
    }

    @Test
    public void isHarvestedTest() {
        Assert.assertFalse(tomatoPlant.hasBeenHarvested());
    }

    @Test
    public void yieldTest() {
        tomatoPlant.yield(tomato);
        int actual = tomato.currentCount();
        Assert.assertEquals(0, actual);
    }
}