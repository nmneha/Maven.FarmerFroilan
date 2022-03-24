package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public  abstract class Crop implements Produce {

    public int yield(){ return 0;
    }

    public boolean hasBeenHarvested() {
        return true;
    }

    public boolean hasBeenFertilized() {
        return true;
    }
}
