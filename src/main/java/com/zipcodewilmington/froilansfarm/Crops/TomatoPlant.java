package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {
    boolean isFertilized = false;
    boolean isHarvested = false;

    public void yield() {
        Tomato tomato = new Tomato();
        if(isFertilized() && isFertilized()) {
            tomato.harvested();
        }
    }


    public boolean hasBeenFertilized() {
        return isFertilized;
    }


    public boolean hasBeenHarvested() {
        return isHarvested;
    }
}
