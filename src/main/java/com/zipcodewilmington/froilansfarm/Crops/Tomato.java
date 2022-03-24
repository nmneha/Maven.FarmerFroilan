package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Tomato implements Edible {
<<<<<<< HEAD

=======
    int tomatoCount;

    @Override
    public int consumed() {
        return tomatoCount--;
    }

    @Override
    public int harvested() {
        return tomatoCount++;
    }

    @Override
    public int currentCount() {
        return tomatoCount;
    }
>>>>>>> 84995079d28f07db6dc4efcb6a4220a79e4729e6
}
