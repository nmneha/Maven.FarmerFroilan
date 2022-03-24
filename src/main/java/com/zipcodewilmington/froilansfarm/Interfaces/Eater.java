package com.zipcodewilmington.froilansfarm.Interfaces;



public interface Eater <EdibleType extends Edible >{

    String eat(EdibleType food);
}
