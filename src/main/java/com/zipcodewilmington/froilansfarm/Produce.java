package com.zipcodewilmington.froilansfarm;

public interface Produce {
    default int yield (){
        return 0;
    }
}
