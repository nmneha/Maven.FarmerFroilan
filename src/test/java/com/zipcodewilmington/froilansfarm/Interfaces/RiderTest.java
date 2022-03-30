package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RiderTest {

    @Test
    void mount() {
        Horse horse = new Horse();
        Person person = new Person();
        person.mount();
        assertTrue(Horse.mounted);
    }

    @Test
    void dismount() {
        Horse horse = new Horse();
        Person person = new Person();
        person.disMount();
        assertTrue(Horse.disMounted);
    }

    @Test
    void ride() {
        Horse horse = new Horse();
        Person person = new Person();
        person.disMount();
        assertTrue(Horse.disMounted);
    }
}