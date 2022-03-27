package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Produce {
    default void yield (){}

    default boolean hasBeenFertilized() {
        return false;
    }

    default boolean hasBeenHarvested() {
        return false;
    }
}
