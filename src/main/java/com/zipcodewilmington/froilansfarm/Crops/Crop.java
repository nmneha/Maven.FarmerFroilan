package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public  abstract class Crop implements Produce {
    boolean fertilizedStatus = false;


    public  boolean isFertilized(){
        return fertilizedStatus;
    }
}
