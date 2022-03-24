package com.zipcodewilmington.froilansfarm.Interfaces;

public interface FarmVehicle {

    public static final boolean isRunning = true;

    default boolean operate() {
        return isRunning;
    }
}
