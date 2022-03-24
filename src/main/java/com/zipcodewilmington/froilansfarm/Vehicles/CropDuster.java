package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {
    public boolean fertilize() {
        return false;
    }

    @Override
    public boolean operate() {
        // TODO Auto-generated method stub
        return FarmVehicle.super.operate();
    }

    @Override
    public boolean fly() {

    }

    @Override
    public String makeNoise() {
        // TODO Auto-generated method stub
        return super.makeNoise();
    }

}

// needs to "fertilize" a "cropRow"
