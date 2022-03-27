package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {

    public Edible yield() {
        Tomato tomato = new Tomato();
        if(isFertilized() && isFertilized()) {
            return tomato;
        }
        return null;
    }

    @Override
    public boolean isFertilized(boolean isFertilized) {
        return isFertilized;
    }

    @Override
    public boolean isHarvested(boolean isHarvested) {
        return isHarvested;
    }
}
