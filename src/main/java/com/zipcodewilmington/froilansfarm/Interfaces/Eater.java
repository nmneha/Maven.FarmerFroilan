package com.zipcodewilmington.froilansfarm.Interfaces;



public interface Eater <EdibleType extends Edible >{

    default void eat(EdibleType food){
          //food.consume();
    }
}
