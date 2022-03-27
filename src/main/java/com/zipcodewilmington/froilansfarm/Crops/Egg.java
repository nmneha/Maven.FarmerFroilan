package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Egg implements Produce, Edible {
    boolean isFertilized = false;
    boolean isHarvested = false;
    int eggCount;


    public boolean hasBeenFertilized() {
        return isFertilized;
    }

    public boolean hasBeenHarvested() {
        return isHarvested;
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
