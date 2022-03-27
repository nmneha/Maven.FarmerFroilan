package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public  abstract class Crop implements Produce {
    public boolean isFertilized;
    public boolean isHarvested;

    public  boolean hasBeenFertilized(){
        return isFertilized;
    }

    public boolean hasBeenHarvested() {
        return isHarvested;
    }
}
