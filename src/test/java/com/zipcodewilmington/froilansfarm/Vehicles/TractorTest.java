package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.Crops.*;
import org.junit.Test;
import org.testng.Assert;

public class TractorTest {

    @Test
    public void operateTest() {
        Person person = new Farmer<>();
        Field field = new Field();
        CropRow croprow = new CropRow();
        Crop cornstalk = new CornStalk();
        croprow.add(cornstalk);
        field.add(croprow);
        Tractor tractor = new Tractor();

        org.junit.Assert.assertTrue(tractor.operate(person, field));

    }

    @Test
    public void makeNoiseTest() {
        Tractor johnDeere = new Tractor();
        String expected = "GLUG GLUG";
        String actual = johnDeere.makeNoise();
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void harvestTest() {
        Tractor tractor = new Tractor();
        CropDuster dust = new CropDuster();
        Field field = new Field();
        CropRow croprow = new CropRow();
        Crop cornstalk = new CornStalk();
        Crop tomatoPlant = new TomatoPlant<>();
        //croprow.add(cornstalk);
        croprow.add(tomatoPlant);
        field.add(croprow);
        //field.add(croprow);
        dust.fertilize(field);
        int actual = tractor.harvest(field);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
}