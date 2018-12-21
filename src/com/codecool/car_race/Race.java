package com.codecool.car_race;

import java.util.ArrayList;

class Race {

    private boolean isRaining;

    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Motorcycle> motorcycles = new ArrayList<>();
    private ArrayList<Truck> trucks = new ArrayList<>();

    Race() {
        isRaining = false;
    }

    void setVehicles(ArrayList<Car> listOfCars, ArrayList<Motorcycle> listOfMotors, ArrayList<Truck> listOfTrucks) {
        cars = listOfCars;
        motorcycles = listOfMotors;
        trucks = listOfTrucks;
    }

    void simulateRace() {

    }

    void printRaceResults() {

    }

    boolean isThereABrokenTruck() {
        boolean brokenTruckPresent = false;
        for (Truck truck: trucks) {
            if (truck.getBreakdownTurnsLeft() > 0) brokenTruckPresent = true;
        }
        return brokenTruckPresent;
    }

    boolean isItRaining() {
        return isRaining;
    }

}
