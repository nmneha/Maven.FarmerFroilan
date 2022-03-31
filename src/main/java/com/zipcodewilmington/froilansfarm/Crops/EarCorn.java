package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.Random;


public class EarCorn extends Edible {
    static int cornCount = 50;



    public static int consumed() {
        if (cornCount > 0) {
            return cornCount--;
        }
        return cornCount;
    }


    public static int harvested() {
        return cornCount+10;
    }


    public static int currentCount() {
        return cornCount;
    }


}
