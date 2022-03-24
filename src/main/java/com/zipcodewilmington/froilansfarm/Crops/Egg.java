package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Egg implements Produce, Edible {
    int eggCount;

    public boolean hasBeenFertilized() {
        return false;
    }


    public boolean hasBeenHarvested() {
        return true;
    }

    @Override
    public int consumed() {
        return eggCount--;
    }

    @Override
    public int harvested() {
        return eggCount++;
    }

    @Override
    public int currentCount() {
        return eggCount;
    }
}
