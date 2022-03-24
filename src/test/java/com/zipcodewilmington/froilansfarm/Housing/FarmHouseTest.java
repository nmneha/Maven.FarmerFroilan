package com.zipcodewilmington.froilansfarm.Housing;

import com.zipcodewilmington.froilansfarm.Animals.Person;

import static org.junit.jupiter.api.Assertions.*;

public class FarmHouseTest {

    @org.junit.jupiter.api.Test
    public void addToHouseTest(){
        //
        Person fro = new Person();
        Person frolina = new Person();
        FarmHouse house = new FarmHouse();
        house.housed.add(fro);
        house.housed.add(frolina);
        //when
        int result = 2;
        int actual = house.housed.size();
        // then
        assertEquals(result,actual);

    }

}