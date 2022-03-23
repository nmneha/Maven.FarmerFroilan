package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Edible {
    String EdibleEgg = "";
    String EarCorn = "";
    String Tomato = "";

    default boolean hasBeenFertilized(){
        return true;
    }
    default boolean hasBeenHarvested(){
        return true;
    }



}
