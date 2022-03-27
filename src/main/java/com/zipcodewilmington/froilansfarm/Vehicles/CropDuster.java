package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;



import static com.zipcodewilmington.froilansfarm.Interfaces.Produce.*;


public class CropDuster extends Aircraft implements FarmVehicle {


    public boolean fertilize(CropRow... cropRows) {
        boolean fertilized = true;
        for(CropRow s  : cropRows){
            if (inFlight){
                for(int i = 0; i < s.cropRow.size(); i++){
                    Crop c = s.getCrop(i);
                    if(!c.isFertilized()){
                        c.isFertilized(fertilized);
                    }
                }
            }
        }
        return false;
    }

    public boolean operate(Person person, CropRow[] cropRows) {
        if (person instanceof Pilot){
            boolean operated = false;
            fly();
            fertilize();
            operated = true;
            return operated;
        }
        return FarmVehicle.super.operate();
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
