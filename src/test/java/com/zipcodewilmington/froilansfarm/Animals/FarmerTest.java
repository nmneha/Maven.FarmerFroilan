package com.zipcodewilmington.froilansfarm.Animals;

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
        Person froilanda = new Pilot();
        String expected = "Yummy";
        //when
        String actual = froilanda.eat();
        //then
        assertEquals(expected,actual);
    }
}