package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Tomato implements Edible {

    int tomatoCount;

    @Override
    public int consumed() {
        return tomatoCount--;
    }

    @Override
    public int harvested() {
        return tomatoCount++;
    }

    @Override
    public int currentCount() {
        return tomatoCount;
    }
}
