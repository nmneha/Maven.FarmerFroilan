package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HorseTest {

    @Test
    void testMakeNoise() {
        //given
        Horse horse = new Horse();
        String expected = "Neigh neigh";
        //when
        String actual = horse.makeNoise();
        //then
        assertEquals(expected,actual);
    }

    @Test
    void testEat() {
        //given
        EarCorn e = new EarCorn();
        Horse horse = new Horse();
        String expected = "Yumm";
        //when
        String actual = horse.eat(e);
        //then
        assertEquals(expected,actual);
    }
}