package com.codecool.car_race;

import java.util.Random;

public class Weather {
    public boolean setRaining () {
        Random r = new Random();
        boolean isRaining = false;
        if (r.nextDouble() <= 0.3) isRaining = true;
        return isRaining;
    }
}
