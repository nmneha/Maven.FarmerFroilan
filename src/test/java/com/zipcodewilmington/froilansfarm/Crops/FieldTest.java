package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class FieldTest {

    @Test

    public void getAddCropRowTest(){
        Field field = new Field();
        CropRow croprows = new CropRow();
        field.add(croprows);
        Assert.assertEquals(field.size(), 1);
    }

    @Test
    public void getCropRowTest(){
        Field field = new Field();
        CropRow croprows = new CropRow();
        field.add(croprows);
        Assert.assertTrue(field.getCropRow(0) != null);

    }


}