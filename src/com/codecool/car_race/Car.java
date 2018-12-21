package com.codecool.car_race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Car extends Vehicle {

    private String name;

    Car (int startSpeed) {
        super(startSpeed);
        name = generateName();
    }

    private String generateName() {
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
}
