package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal<EarCorn> implements Produce {
        boolean hasBeenFertilized = false;

        @Override
        public String makeNoise() {
                return "cluck cluck";
        }

        @Override
        public String eat(EarCorn food) {
                food.consumed();
                return "Yummy";
        }
        //yeild eggs
}
