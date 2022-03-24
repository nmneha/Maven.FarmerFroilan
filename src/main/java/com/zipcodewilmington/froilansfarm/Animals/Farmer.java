package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;


public class Farmer<CropType> extends Person implements Rider, Botanist<CropType> {
    public String makeNoise(){
        return "Howdy";
    }


    @Override
    public void mount() {
        Rider.super.mount();
    }

    @Override
    public void dismount() {
        Rider.super.dismount();
    }

    @Override
    public String eat(Edible food) {
        return super.eat(food);
    }
}
