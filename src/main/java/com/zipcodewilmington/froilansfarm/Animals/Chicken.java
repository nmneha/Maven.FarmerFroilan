package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import static com.zipcodewilmington.froilansfarm.Crops.EarCorn.consumed;

public class Chicken<Earcorn extends Edible> extends Animal<Earcorn> implements Produce {
        boolean hasBeenFertilized = false;

        @Override
        public String makeNoise() {
                return "cluck cluck";
        }

        @Override
        public String eat(Earcorn food) {
                Earcorn.consumed();
                return "Yummy";
        }
        //yeild eggs
}
