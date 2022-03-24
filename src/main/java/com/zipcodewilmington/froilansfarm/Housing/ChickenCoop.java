package com.zipcodewilmington.froilansfarm.Housing;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Person;

import java.util.ArrayList;

public class ChickenCoop extends Housing<Chicken> {

    public ChickenCoop() {
        super.housed = new ArrayList<Chicken>();
    }



}
