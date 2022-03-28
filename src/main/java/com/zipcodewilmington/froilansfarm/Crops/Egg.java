package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Egg implements Produce, Edible {
    boolean isFertilized = false;
    boolean isHarvested = false;
    int eggCount;

    public void yield(Edible edible) {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            edible.harvested();
        }
    }

    public boolean hasBeenFertilized() {
        return isFertilized;
    }

    public boolean hasBeenHarvested() {
        return isHarvested;
    }

    @Override
    public int consumed() {
        if (eggCount > 0) {
            return eggCount--;
        }
        return eggCount;
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
