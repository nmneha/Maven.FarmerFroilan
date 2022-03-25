package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Field {
    public ArrayList<CropRow> field = new ArrayList<>();

    public void add(CropRow croprows) {
        field.add(croprows);
    }

    public int size() {

        return field.size();
    }

    public CropRow getCropRow(int i) {
        return field.get(i);
    }
}
