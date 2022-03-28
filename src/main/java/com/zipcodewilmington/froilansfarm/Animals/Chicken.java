package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import static com.zipcodewilmington.froilansfarm.Crops.EarCorn.consumed;

public class Chicken extends Animal implements Produce {
        boolean hasBeenFertilized = false;

        @Override
        public String makeNoise() {
                return "cluck cluck";
        }

        @Override
        public String eat() {
                EarCorn.consumed();
                return "Yummy";
        }
        //yeild eggs
}
