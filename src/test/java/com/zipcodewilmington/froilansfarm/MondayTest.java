package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.*;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Housing.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Housing.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MondayTest {
@Test
    public void mondaySim(){
    Person Froilan = new Farmer<>();
    Person Froilanda = new Pilot();
    CropDuster cropduster = new CropDuster();
    Tractor tractor = new Tractor();
    Field field = new Field();
    CropRow cropRow = new CropRow();
    CropRow cropRow1 = new CropRow();
    CropRow cropRow2 = new CropRow();
    CropRow cropRow3 = new CropRow();
    CropRow cropRow4 = new CropRow();
    Crop corn = new CornStalk();
    Crop corn1 = new CornStalk();
    Crop tomato = new TomatoPlant();

    //Add Chickens to Coops
    ChickenCoop coop1 = new ChickenCoop();
    ChickenCoop coop2 = new ChickenCoop();
    ChickenCoop coop3 = new ChickenCoop();
    ChickenCoop coop4 = new ChickenCoop();

    for (int i = 0; i < 15; i++) {
        Chicken c = new Chicken();
        if (i < 4) {
            coop1.add(c);
        } else if (i < 8) {
            coop2.add(c);
        } else if (i < 12) {
            coop3.add(c);
        } else {
            coop4.add(c);
        }
    }

    //Add Horses to Stables
    Stable  stable1 = new Stable();
    Stable  stable2 = new Stable();
    Stable  stable3 = new Stable();

    for (int i = 0; i < 10; i++) {
        Horse h = new Horse();
        if (i < 3) {
            stable1.add(h);
        } else if (i < 6) {
            stable2.add(h);
        } else {
            stable3.add(h);
        }
    }

//Add Crops to CropRows
    cropRow.add(corn);
    cropRow1.add(tomato);
    cropRow2.add(corn1);
    //Add CropRows to Field
    field.add(cropRow);
    field.add(cropRow1);
    field.add(cropRow2);
    field.add(cropRow3);
    field.add(cropRow4);

    //Everyday Activities

    //Ride Horses
    for (int i = 0; i < 3; i++) {
            Froilan.ride(stable1.getHorse(i));
            Froilan.feed(stable1.getHorse(i), 3);
    }
    for (int i = 0; i < 3; i++) {
        Froilan.ride(stable2.getHorse(i));
        Froilan.feed(stable2.getHorse(i), 3);
    }
    for (int i = 0; i < 4; i++) {
        Froilanda.ride(stable3.getHorse(i));
        Froilanda.feed(stable3.getHorse(i), 3);
    }

    //BreakFast
    Froilan.meal(5, 1, 2);
    Froilanda.meal(2, 2, 1);



    //Fertilize field
    cropduster.operate(Froilanda, field);
}
}