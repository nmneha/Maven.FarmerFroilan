package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop{

    public Edible yield() {
        return null;
    }

    @Override
    public boolean hasBeenHarvested() {
        return true;
    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }

}
