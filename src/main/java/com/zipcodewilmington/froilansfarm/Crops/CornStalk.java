package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop{

    public Edible yield() {
        EarCorn corn = new EarCorn();
        if(isFertilized() && isFertilized()) {
            return corn;
        }
        return null;
    }


    public boolean isFertilized(boolean isFertilized) {
        return isFertilized;
    }


    public boolean isHarvested(boolean isHarvested) {
        return isHarvested;
    }
}
