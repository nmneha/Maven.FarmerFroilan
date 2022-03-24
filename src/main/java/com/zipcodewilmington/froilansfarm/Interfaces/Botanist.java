package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;

public interface Botanist <CropType extends Crop>{
    default void plant(CropRow row,CropType crop){
//        row.hsCrop(crop);
//        crop.increase();
    }
}
