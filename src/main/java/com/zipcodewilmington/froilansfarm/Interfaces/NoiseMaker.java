package com.zipcodewilmington.froilansfarm.Interfaces;

public interface NoiseMaker {
    default String makeNoise(String input) {
        return input;
    }
}
