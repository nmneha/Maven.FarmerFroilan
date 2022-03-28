package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Crops.Egg;
import com.zipcodewilmington.froilansfarm.Crops.Tomato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmerTest {

    @Test
    void makeNoiseTest() {
        //given
        Person froilin = new Farmer();
        String expected = "Howdy";
        //when
        String actual = froilin.makeNoise();
        //then
        assertEquals(expected,actual);
    }

    @Test
    void mountTest() {
    }

    @Test
    void dismountTest() {
    }

    @Test
    void eatTest() {
        Person froilanda = new Farmer();
        String expected = "Yummy";
        //when
        String actual = froilanda.eat();
        //then
        assertEquals(expected,actual);
    }

    @Test
    void mealTest(){
        int expectedCount = 0;
        Egg.count =1;
        Tomato.count = 3;
        EarCorn.count = 2;
        Person froilanda = new Farmer();
        String expected = "I'm Full";
        //when
        String actual = froilanda.meal(1,2,3);
        //then
        assertEquals(expected,actual);
        assertEquals(expectedCount,EarCorn.currentCount());
        assertEquals(expectedCount,Tomato.currentCount());
        assertEquals(expectedCount,Egg.currentCount());
    }
}