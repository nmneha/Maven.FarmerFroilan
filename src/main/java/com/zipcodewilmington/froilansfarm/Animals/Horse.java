package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal<EarCorn> implements Rideable {

    @Override
    public String makeNoise() {
        return "Neigh neigh";
    }

    @Override
    public String eat(EarCorn food) {
        return "Yumm";
    }
}
