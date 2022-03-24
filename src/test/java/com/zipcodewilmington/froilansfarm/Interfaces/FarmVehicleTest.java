package com.zipcodewilmington.froilansfarm.Interfaces;

import static org.junit.jupiter.api.Assertions.*;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import org.junit.Test;

class FarmVehicleTest {

    @Test
    public void operateTest() {
        Tractor tractor = new Tractor();
        boolean actual = tractor.operate();
        assertTrue(actual);
    }

}