package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle<Farmer> implements FarmVehicle {



    public int harvest(Field field) {
        int harvest = 0;
        for (int i = 0; i < field.size(); i++){
            CropRow cropRow = field.getCropRow(i);
            System.out.println(cropRow.toString());
            for (int j = 0; i < cropRow.size(); i++){
                Crop c = cropRow.getCrop(j);
                System.out.println(c.toString());
                if (c.isFertilized){
                    if (c instanceof CornStalk){
                        EarCorn earCorn = new EarCorn();
                        c.yield(earCorn);
                        cropRow.clearCrop();
                    } else {
                        Tomato tomato = new Tomato();
                        tomato.harvested();
                        cropRow.clearCrop();
                    }
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
