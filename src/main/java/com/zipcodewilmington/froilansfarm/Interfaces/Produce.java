package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Produce {
    default Edible yield (){
        return null;
    }

    default boolean isFertilized(boolean isFertilized) {
        return false;
    }

    default boolean isHarvested(boolean isHarvested) {
        return false;
    }
}
