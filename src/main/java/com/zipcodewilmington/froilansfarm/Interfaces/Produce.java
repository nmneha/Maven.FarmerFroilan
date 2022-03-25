package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Produce {
    default Edible yield (){
        return null;
    }



    default boolean hasBeenFertilized(boolean isFertilized) {
        return false;
    }

    default boolean hasBeenHarvested(boolean isHarvested) {
        return false;
    }
}
