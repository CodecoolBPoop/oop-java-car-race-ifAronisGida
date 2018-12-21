package com.codecool.car_race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Car extends Vehicle {

    private String name;
    private int speed;
    private int normalSpeed;

    Car () {
        normalSpeed = generateSpeed();
        name = generateCarName();
        speed = normalSpeed;
    }

    private String generateCarName() {
        ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList("Aurora",
                "Dusk",
                "Flux",
                "Celestial",
                "Guerilla",
                "Supremacy",
                "Morale",
                "Bullet",
                "Dragon",
                "Wish"));

        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        sb.append(listOfNames.get(r.nextInt(10)));
        sb.append(" ");
        sb.append(listOfNames.get(r.nextInt(10)));

        return sb.toString();
    }

    private int generateSpeed() {
        Random r = new Random();
        int speed = r.nextInt(31) + 80;
        return speed;
    }

    void prepareForLap(Race race) {
        if (race.isThereABrokenTruck()) {
            speed = 75;
        } else {
            speed = normalSpeed;
        }
    }
}
