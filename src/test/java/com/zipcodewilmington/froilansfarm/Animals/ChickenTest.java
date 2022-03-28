package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChickenTest {


    @Test
    void makeNoiseTest() {
        //given
        Chicken chicken = new Chicken();
        String expected = "cluck cluck";
        //when
         String actual = chicken.makeNoise();
        //then
        assertEquals(expected,actual);
    }

    @Test
    void eatTest() {
        //given
        Chicken chicken = new Chicken();
        String expected = "Yummy";
        //when
        EarCorn e = new EarCorn();
        String actual = chicken.eat(e);
        //then
        assertEquals(expected,actual);
    }
}