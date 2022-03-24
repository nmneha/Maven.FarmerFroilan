package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Egg implements Produce, Edible {
    int eggCount;

    @Override
    public boolean hasBeenFertilized() {
        return Produce.super.hasBeenFertilized();
    }

    @Override
    public boolean hasBeenHarvested() {
        return Produce.super.hasBeenHarvested();
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
