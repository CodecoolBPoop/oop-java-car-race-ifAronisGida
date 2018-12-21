package com.codecool.car_race;

class Motorcycle extends Vehicle {

    private int normalSpeed;
    private int speed;
    private String name;

    private static int motorcycleNumber = 1;

    Motorcycle() {
        normalSpeed = 100;
        speed = normalSpeed;
        name = generateMotorcycleName();
        motorcycleNumber++;
    }

    private String generateMotorcycleName() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motorcycle ");
        sb.append(motorcycleNumber);
        return sb.toString();

    }

    void prepareForLap(Race race) {

    }
}
