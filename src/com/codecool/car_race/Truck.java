package com.codecool.car_race;

import java.util.Random;

class Truck extends Vehicle {

    private int breakdownTurnsLeft;
    private int name;

    Truck () {
        speed = 100;
        breakdownTurnsLeft = 0;
        name = generateTruckName();
    }

    int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    private int generateTruckName() {
        Random r = new Random();
        int truckNumber = r.nextInt(1001);
        return truckNumber;
    }

    void prepareForLap(Race race) {
        Random r = new Random();
        if (breakdownTurnsLeft == 0 && r.nextDouble() <= 0.05) breakdownTurnsLeft += 2;
        else if (breakdownTurnsLeft < 0) breakdownTurnsLeft -= 1;
    }

}
