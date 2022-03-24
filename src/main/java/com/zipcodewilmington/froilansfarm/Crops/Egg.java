package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Egg implements Edible {

    public boolean hasBeenFertilized() {
        return false;
    }


    public boolean hasBeenHarvested() {
        return true;
    }
}
