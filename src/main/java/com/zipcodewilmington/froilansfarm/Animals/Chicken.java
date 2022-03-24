package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {
        boolean hasBeenFertilized = false;

        @Override
        public String makeNoise() {
                return null;
        }
}
