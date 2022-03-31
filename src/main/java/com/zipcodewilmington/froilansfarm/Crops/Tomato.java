package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Tomato extends Edible {

    public static int tomatoCount = 20;


    public static int consumed() {
        if (tomatoCount > 0) {
            return tomatoCount--;
        }
        return tomatoCount;
    }


    public static int harvested() {
        return tomatoCount+8;
    }


    public static int currentCount() {
        return tomatoCount;
    }
}
