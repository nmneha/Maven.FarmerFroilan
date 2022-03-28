package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public  abstract class Crop implements Produce {
    public boolean isFertilized;
    public boolean isHarvested;


    public void yield() {
        if(hasBeenFertilized() && hasBeenHarvested()) {
            Edible.harvested();
        }
    }

    public  boolean hasBeenFertilized(){
        return isFertilized;
    }

    public boolean hasBeenHarvested() {
        return isHarvested;
    }
}
