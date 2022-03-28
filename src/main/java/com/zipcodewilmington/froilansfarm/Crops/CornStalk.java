package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop{

    public void yield() {
        if(hasBeenFertilized() && hasBeenHarvested()) {
            EarCorn.harvested();
        }
    }

}
