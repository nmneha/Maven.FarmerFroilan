package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class EarCorn extends Edible {
    static int cornCount = 0;


    public static int consumed() {
        if (cornCount > 0) {
            return cornCount--;
        }
        return cornCount;
    }


    public static int harvested() {
        return cornCount++;
    }


    public static int currentCount() {
        return cornCount;
    }


}
