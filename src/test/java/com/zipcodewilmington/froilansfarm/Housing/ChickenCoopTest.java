package com.zipcodewilmington.froilansfarm.Housing;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Person;

import static org.junit.jupiter.api.Assertions.*;

public class ChickenCoopTest {
    @org.junit.jupiter.api.Test
    public void addToCoopTest(){
        //
        Chicken fro = new Chicken();
        Chicken frolina = new Chicken();
        ChickenCoop house = new ChickenCoop();
        house.housed.add(fro);
        house.housed.add(frolina);
        //when
        int result = 2;
        int actual = house.housed.size();
        // then
        assertEquals(result,actual);

    }

}