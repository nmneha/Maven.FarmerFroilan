package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Egg extends Edible implements Produce {
    boolean isFertilized = false;
    boolean isHarvested = false;
    static int eggCount = 20;

    public void yield(Egg egg) {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            egg.harvested();
        }
    }

    public boolean hasBeenFertilized() {
        return isFertilized;
    }

    public boolean hasBeenHarvested() {
        return isHarvested;
    }

    public static int consumed() {
        if (eggCount > 0) {
            return eggCount--;
        }
        return eggCount;
    }

    public static int harvested() {
        return eggCount++;
    }

    public static int currentCount() {
        return eggCount;
    }
}
