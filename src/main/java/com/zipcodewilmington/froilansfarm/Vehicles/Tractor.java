package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle<Farmer> implements FarmVehicle {



    public int harvest(Field field) {
        int harvest = 0;
        for (int i = 0; i < field.size(); i++){
            CropRow cropRow = field.getCropRow(i);
            for (int j = 0; i < cropRow.size(); i++){
                Crop c = cropRow.getCrop(j);
                if (c.isFertilized){
                    harvest++;

                }
            }
        }
        return harvest;
    }


    public boolean operate(Person person, Field field) {
            boolean operated = false;
            if (person instanceof Farmer){
                harvest(field);
                return true;
            }else {
                return false;
            }
        }


    @Override
    public String makeNoise() {
        // TODO Auto-generated method stub
        return "GLUG GLUG";
    }

    // Tractor needs to "harvest" a "crop"

}
