package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Produce {
    default Edible yield (){
        return null;
    }
}
