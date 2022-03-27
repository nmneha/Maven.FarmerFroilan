package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Egg implements Produce, Edible {
    int eggCount;


    public boolean isFertilized(boolean isFertilized) {
        return isFertilized;
    }

    public boolean isHarvested(boolean isHarvested) {
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
