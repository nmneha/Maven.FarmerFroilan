package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class CropRowTest {


    @Test
    public void addSizeCropTest() {
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

    @Test
    public void clearCropTest() {
        CropRow cropRow = new CropRow();
        CornStalk cornStalk = new CornStalk();
        cropRow.add(cornStalk);
        System.out.println("Size: " + cropRow.size());
        cropRow.clearCrop();
        System.out.println("After Clear: " + cropRow.size());
        Assert.assertEquals(0, cropRow.size());
    }


}