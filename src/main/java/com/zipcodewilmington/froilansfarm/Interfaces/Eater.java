package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Crops.Crop;

public interface Eater <EdibleType extends Edible >{
    default void eat(EdibleType food){
          //food.consume();
    }
}
