package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.Tomato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotTest {

    @Test
    void makeNoise() {
        //given
        Person froilanda = new Pilot();
        String expected = "Hi";
        //when
        String actual = froilanda.makeNoise();
        //then
        assertEquals(expected,actual);
    }


    @Test
    void eat() {
        //given
        Tomato t = new Tomato();
        Person froilanda = new Pilot();
        String expected = "Yummy";
        //when
        String actual = froilanda.eat(t);
        //then
        assertEquals(expected,actual);
    }
}