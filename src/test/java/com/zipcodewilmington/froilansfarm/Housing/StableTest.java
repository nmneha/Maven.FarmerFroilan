package com.zipcodewilmington.froilansfarm.Housing;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Person;

import static org.junit.jupiter.api.Assertions.*;

public class StableTest {
    @org.junit.jupiter.api.Test
    public void addToHouseTest(){
        //
        Horse fro = new Horse();
        Horse frolina = new Horse();
        Stable house = new Stable();
        house.housed.add(fro);
        house.housed.add(frolina);
        //when
        int result = 2;
        int actual = house.housed.size();
        // then
        assertEquals(result,actual);

    }
}