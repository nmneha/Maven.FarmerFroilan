package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Crops.Tomato;

public interface Botanist <CropType extends Crop>{
    default void plantRow(CropRow row,CropType crop){
        row.cropRow.add(crop);
    }

    default void plantFeild(Field field, CropType crop){
        for(int x =0;x<field.field.size();x++)
        plantRow(field.field.get(x),crop);
    }

}
