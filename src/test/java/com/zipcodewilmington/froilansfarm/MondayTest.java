package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class MondayTest {
@Test
    public void mondaySim(){
    Person Froilan = new Farmer<>();
    Person Froilada = new Pilot();
    CropDuster cropduster = new CropDuster();
    Field field = new Field();
    CropRow cropRow = new CropRow();
    CropRow cropRow1 = new CropRow();
    CropRow cropRow2 = new CropRow();
    CropRow cropRow3 = new CropRow();
    CropRow cropRow4 = new CropRow();
    Crop corn = new CornStalk();
    Crop corn1 = new CornStalk();
    Crop tomato = new TomatoPlant();

    cropRow.add(corn);
    cropRow1.add(tomato);
    cropRow2.add(corn1);
    //Add CropRows to Field
    field.add(cropRow);
    field.add(cropRow1);
    field.add(cropRow2);

    //Fertilize field
    cropduster.operate(Froilada, field);
}
}