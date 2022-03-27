package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TomatoPlantTest {
    Crop tomatoPlant = new TomatoPlant();

    @Test
    public void isfertilizedTest(){
        Assert.assertFalse(tomatoPlant.isFertilized());

    }

    @Test
    public void isHarvestedTest() {
        Assert.assertFalse(tomatoPlant.isHarvested());
    }
}