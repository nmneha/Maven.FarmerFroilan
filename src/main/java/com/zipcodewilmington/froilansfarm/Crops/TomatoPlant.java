package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {

    public Edible yield() {
        return null;
    }

    @Override
    public boolean hasBeenFertilized(boolean isFertilized) {
        return isFertilized;
    }

    @Override
    public boolean hasBeenHarvested(boolean isHarvested) {
        return isHarvested;
    }
}
