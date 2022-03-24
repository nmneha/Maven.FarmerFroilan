package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;

public interface Botanist <CropType extends Crop>{
    default void plant(CropRow row,CropType crop){
//        row.hasCrop(crop);
//        crop.increase();
    }
}
