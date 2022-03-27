package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class CropRowTest {


    @Test
    public void addCropTest() {
        CropRow cropRow = new CropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.add(tomatoPlant);
        Assert.assertEquals(cropRow.size(), 1);
    }

    @Test
    public void getCropTest() {
        CropRow cropRow = new CropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.add(tomatoPlant);
        Assert.assertTrue(cropRow.getCrop(0) != null);
    }


}