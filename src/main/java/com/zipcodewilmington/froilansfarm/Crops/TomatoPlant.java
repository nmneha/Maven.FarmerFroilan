package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {

    public void yield() {
        if(hasBeenFertilized() && hasBeenHarvested()) {
            Tomato.harvested();
        }
    }

}
