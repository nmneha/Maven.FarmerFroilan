package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Crops.Egg;
import com.zipcodewilmington.froilansfarm.Crops.Tomato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotTest {

    @Test
    void makeNoiseTest() {
        //given
        Person froilanda = new Pilot();
        String expected = "Hi";
        //when
        String actual = froilanda.makeNoise();
        //then
        assertEquals(expected,actual);
    }


    @Test
    void eatTest() {
        //given
        Person froilanda = new Pilot();
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
        Person froilanda = new Pilot();
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