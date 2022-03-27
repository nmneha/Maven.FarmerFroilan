package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Crops.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BotanistTest {

    @Test
    void plantRowTest() {
        Farmer<Crop> bob = new Farmer();
        TomatoPlant tomato = new TomatoPlant();
        CornStalk corn = new CornStalk();
        CropRow row = new CropRow();
        CropRow row2 = new CropRow();
        bob.plantRow(row,tomato);
        bob.plantRow(row2,corn);


        assertTrue(row.getCrop(0) instanceof Crop);
        //assertTrue(row.getCrop(0) instanceof CornStalk);
    }

    @Test
    void plantFieldTest() {
        Farmer<Crop> bob = new Farmer();
        TomatoPlant tomato = new TomatoPlant();
        CornStalk corn = new CornStalk();
        Field field = new Field();
        field.add(new CropRow());
        field.add(new CropRow());
        bob.plantField(field,tomato,corn);
        ArrayList<CropRow> expected = new ArrayList<>();
        CropRow row = new CropRow();
        CropRow row2 = new CropRow();
        expected.add(bob.plantRow(row,tomato));
        expected.add(bob.plantRow(row2,corn));

        assertEquals(expected.get(0) instanceof CropRow,field.getCropRow(0) instanceof CropRow);

    }
}