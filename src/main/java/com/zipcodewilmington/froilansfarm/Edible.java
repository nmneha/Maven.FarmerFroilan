package com.zipcodewilmington.froilansfarm;

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
