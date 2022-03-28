package com.zipcodewilmington.froilansfarm.Animals;


import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot extends Person implements Rider {

    public String makeNoise(){
        return "Hi";
    }

    @Override
    public String eat(Edible food) {
        return super.eat(food);
    }

    @Override
    public void mount() {
        Rider.super.mount();
    }

    @Override
    public void dismount() {
        Rider.super.dismount();
    }


}
