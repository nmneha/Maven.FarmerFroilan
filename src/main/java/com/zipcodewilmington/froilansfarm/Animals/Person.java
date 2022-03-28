package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Person extends Animal{

    @Override
    public String makeNoise() {
        return "Hello";
    }

    @Override
    public String eat() {
        Edible.consumed();
        return "Yummy";
    }
}
