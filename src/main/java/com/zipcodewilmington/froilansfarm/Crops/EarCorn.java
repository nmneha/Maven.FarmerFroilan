package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class EarCorn implements Edible {
    Integer cornCount = 0;

    @Override
    public int consumed() {
        return cornCount--;
    }

    @Override
    public int harvested() {
        return cornCount++;
    }

    @Override
    public int currentCount() {
        return cornCount;
    }


}
