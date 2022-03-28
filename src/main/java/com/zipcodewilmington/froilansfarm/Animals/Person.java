package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Crops.Egg;
import com.zipcodewilmington.froilansfarm.Crops.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Person extends Animal{

    @Override
    public String makeNoise() {
        return "Hello";
    }

    @Override
    public String eat() {
        Edible.consumed();
        return "Yummy";
    }

    public String meal(int eggNum,int cornNum, int tomatoNum){
        for(int x =0;x<eggNum;x++) Egg.consumed();
        for(int y =0;y<cornNum;y++) EarCorn.consumed();
        for(int i=0;i <tomatoNum;i++) Tomato.consumed();
        return "I'm Full";
    }
}
