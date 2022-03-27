package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropDusterTest {


    @Test
    void fertilize() {
        //given
        CropDuster cropduster = new CropDuster();
        Field field = new Field();
        CropRow croprow = new CropRow();
        Crop cornstalk = new CornStalk();
        croprow.add(cornstalk);
        field.add(croprow);
        //when
        cropduster.fertilize(field);
        //then
        assertTrue(cornstalk.isFertilized);
    }

    @Test
    void operate() {
        Person person = new Pilot();
        Field field = new Field();
        CropRow croprow = new CropRow();
        Crop cornstalk = new CornStalk();
        CropDuster duster = new CropDuster();

        Assert.assertTrue(duster.operate(person, field));

    }
}