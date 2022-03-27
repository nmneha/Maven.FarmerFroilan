package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Produce<Food extends Edible> {

    default void yield(Edible edible) {if (hasBeenHarvested() && hasBeenFertilized()) {
        edible.harvested();
    }
    }

    default boolean hasBeenFertilized() {
        return false;
    }

    default boolean hasBeenHarvested() {
        return false;
    }
}
