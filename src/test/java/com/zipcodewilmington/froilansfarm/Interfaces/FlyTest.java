package com.zipcodewilmington.froilansfarm.Interfaces;

import static org.junit.jupiter.api.Assertions.*;

import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;

import org.junit.Test;

class FlyTest {

@Test

public void flyTest(){
    CropDuster cropduster = new CropDuster();
    boolean actual = cropduster.fly();
    assertTrue(actual);
}


}