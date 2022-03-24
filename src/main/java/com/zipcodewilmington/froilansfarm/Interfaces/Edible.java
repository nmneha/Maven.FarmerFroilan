package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Edible {

    default boolean hasBeenFertilized(){
        return true;
    }
    default boolean hasBeenHarvested(){
        return true;
    }

}
