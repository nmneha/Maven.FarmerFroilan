package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Tomato implements Edible {

    static int tomatoCount;

    @Override
    public int consumed() {
        if (tomatoCount > 0) {
            return tomatoCount--;
        }
        return tomatoCount;
    }

    @Override
    public  int harvested() {
        return tomatoCount++;
    }

    @Override
    public int currentCount() {
        return tomatoCount;
    }
}
