package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Fly {
    public static final boolean inFlight = true;

    default boolean fly() {

        return inFlight;
    }
}
