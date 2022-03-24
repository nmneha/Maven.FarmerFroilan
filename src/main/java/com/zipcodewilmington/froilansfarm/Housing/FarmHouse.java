package com.zipcodewilmington.froilansfarm.Housing;

import com.zipcodewilmington.froilansfarm.Animals.Person;

import java.util.ArrayList;

public class FarmHouse  extends Housing<Person> {

    public FarmHouse() {
        super.housed = new ArrayList<Person> ();
    }



}
