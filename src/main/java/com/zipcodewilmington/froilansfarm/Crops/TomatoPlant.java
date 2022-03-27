package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {

    public void yield() {
        Tomato tomato = new Tomato();
        if(hasBeenFertilized() && hasBeenHarvested()) {
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
