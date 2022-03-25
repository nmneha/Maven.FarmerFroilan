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
}
