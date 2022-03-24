package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Produce {
    default Edible yield (){
        return null;
    }

    default boolean hasBeenFertilized(){
        return true;
    }
    default boolean hasBeenHarvested(){
        return true;
    }
}
