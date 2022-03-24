package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Vehicle<RiderType> implements Rideable, NoiseMaker {
    @Override
    public String makeNoise() {
        // TODO Auto-generated method stub
        return null;
    }
}
