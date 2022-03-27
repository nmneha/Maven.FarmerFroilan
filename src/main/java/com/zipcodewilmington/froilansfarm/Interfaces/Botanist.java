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
        for (int x = 0; x < field.field.size(); x++)
            for (CropType crop : crops) {
//                if(field.field == null){
//                    field.field = new ArrayList<CropRow>();
//                }
                field.add(plantRow(field.getCropRow(x), crop));
            }
        return field;
    }
}
