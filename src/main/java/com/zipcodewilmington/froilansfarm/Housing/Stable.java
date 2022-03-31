package com.zipcodewilmington.froilansfarm.Housing;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Person;

import java.util.ArrayList;

public class Stable extends Housing<Horse> {
    public Stable() {
        super.housed = new ArrayList<Horse>();
    }


    public void add(Horse h) {
        super.housed.add(h);
    }

    public Horse getHorse(int i) {
        return super.housed.get(i);
    }
}
