package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Crops.Tomato;

import java.util.ArrayList;

public interface Botanist <CropType extends Crop>{

    default CropRow plantRow(CropRow row,CropType crop){
       if(row == null){
           row = new CropRow();
       }
        row.add(crop);
       return row;
    }

    default Field plantField(Field field, CropType... crops) {
        int x = 0;
        for (CropType crop : crops) {
            field.add(plantRow(field.getCropRow(x), crop));
            x++;
        }
        return field;
    }
}
