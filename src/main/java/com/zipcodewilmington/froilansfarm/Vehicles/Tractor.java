package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle<Farmer> implements FarmVehicle {
    public void harvest() {

    }

    @Override
    public boolean operate() {
        // TODO Auto-generated method stub
        return FarmVehicle.super.operate();
    }

    @Override
    public String makeNoise() {
        // TODO Auto-generated method stub
        return super.makeNoise("GLUG, GLUG");
    }

}
