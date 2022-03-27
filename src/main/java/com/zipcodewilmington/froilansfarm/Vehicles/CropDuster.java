package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;



import static com.zipcodewilmington.froilansfarm.Interfaces.Produce.*;


public class CropDuster extends Aircraft implements FarmVehicle {


    public boolean fertilize(Field field) {
        if (inFlight){
        for(int j = 0; j < field.size(); j++){
            CropRow cropRow = field.getCropRow(j);
                for(int i = 0; i < cropRow.size(); i++){
                    Crop c = cropRow.getCrop(i);
                    if(!c.isFertilized){
                        c.isFertilized = true;
                    }
                }
            }
        }
        return false;
    }

    public boolean operate(Person person, Field field) {
        boolean operated = false;
        if (person instanceof Pilot){
            fly();
            fertilize(field);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean fly() {
        // TODO Auto-generated method stub
        return super.fly();
    }

    @Override
    public String makeNoise() {
        // TODO Auto-generated method stub
        return super.makeNoise();
    }

}

// needs to "fertilize" a "cropRow"
