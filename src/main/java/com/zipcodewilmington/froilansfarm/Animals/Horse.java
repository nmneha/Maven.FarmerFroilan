package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    public static boolean mounted;
    public static boolean disMounted;

    @Override
    public String makeNoise() {
        return "Neigh neigh";
    }

    @Override
    public String eat() {
        EarCorn.consumed();
        return "Yumm";
    }
}
