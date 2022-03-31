package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RiderTest {

    @Test
    void mountTest() {
        Horse horse = new Horse();
        Person person = new Person();
        person.mount();
        assertTrue(Horse.mounted);
    }

    @Test
    void dismountTest() {
        Horse horse = new Horse();
        Person person = new Person();
        person.disMount();
        assertTrue(Horse.disMounted);
    }

    @Test
    void rideTest() {
        Horse horse = new Horse();
        Person person = new Person();
        person.ride();
        assertFalse(Horse.gallup);
    }
}