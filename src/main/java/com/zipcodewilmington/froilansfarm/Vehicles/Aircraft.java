package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.Fly;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;

public class Aircraft extends Vehicle<Pilot> implements Fly {
    @Override
    public boolean fly() {
        // TODO Auto-generated method stub
        return Fly.super.fly();
    }

    @Override
    public String makeNoise() {
        // TODO Auto-generated method stub
        return "VROOM";
    }
}
