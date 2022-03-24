package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Produce {
    default Edible yield (){
        return null;
    }

    boolean isFertilzied = false;

    boolean isHarvested = false;

    default boolean hasBeenFertilized(boolean isFertilized) {
        return false;
    }

    default boolean hasBeenHarvested(boolean isHarvested) {
        return false;
    }
}
