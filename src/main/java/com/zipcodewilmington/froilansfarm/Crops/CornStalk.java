package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop{

    public Edible yield() {
        return null;
    }


    public boolean hasBeenFertilized(boolean isFertilized) {
        return isFertilized;
    }


    public boolean hasBeenHarvested(boolean isHarvested) {
        return isHarvested;
    }
}
