package com.zipcodewilmington.froilansfarm.Crops;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CropRow{
    public List<Crop> cropRow = new ArrayList<>();

    public void add(Crop crop) {
        cropRow.add(crop);
    }

    public int size() {
        return cropRow.size();
    }

    public Crop getCrop(int i) {
        return cropRow.get(i);
    }
}