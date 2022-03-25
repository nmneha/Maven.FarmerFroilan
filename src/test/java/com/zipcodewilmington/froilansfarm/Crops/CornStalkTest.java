package com.zipcodewilmington.froilansfarm.Crops;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CornStalkTest {

    @Test
    public void yieldEarCornTest() {
        //given
        Crop cornStalk = new CornStalk();

    }
    @Test
    public void isfertilizedTest(){
        Crop cornStalk = new CornStalk();
        Assert.assertFalse(cornStalk.isFertilized());

    }

}