package com.zipcodewilmington.froilansfarm.Housing;

import static org.junit.jupiter.api.Assertions.*;

public class FarmTest {


        @org.junit.jupiter.api.Test
        public void addToFarmTest() {
            //given
            Farm farm = new Farm();
            FarmHouse house = new FarmHouse();
            farm.farmhouse = house;
            Stable stable = new Stable();
            Stable stable1 = new Stable();
            ChickenCoop coop = new ChickenCoop();
            ChickenCoop coop1 = new ChickenCoop();
            ChickenCoop coop2 = new ChickenCoop();
            farm.stables.add(stable);
            farm.stables.add(stable1);
            farm.chickenCoops.add(coop);
            farm.chickenCoops.add(coop1);
            farm.chickenCoops.add(coop2);
            //when
            int result = 2;
            int actual = farm.stables.size();
            int numCoops = 3;
            int acCoops = farm.chickenCoops.size();
            // then
            assertEquals(result, actual);
            assertEquals(numCoops, acCoops);
        }
    }


