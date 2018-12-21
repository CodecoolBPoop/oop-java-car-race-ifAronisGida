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

    void simulateRace(Race race) {
        Weather weather = new Weather();

        for (int i = 0; i < 50; i++) {
            weather.setRaining();
            isRaining = weather.getRain();
            for (Car car: cars) {
                car.prepareForLap(race);
                car.moveForAnHour();
            }
            for (Motorcycle motorcycle: motorcycles) {
                motorcycle.prepareForLap(race);
                motorcycle.moveForAnHour();
            }
            for (Truck truck: trucks) {
                truck.prepareForLap();
                truck.moveForAnHour();
            }
        }
    }

    void printRaceResults() {
        System.out.println("Cars: \n");
        for (Car car: cars) {
            System.out.println(car.getName() + ": " + car.getDistanceTraveled() + " km(s)");
        }
        System.out.println("\n");
        System.out.println("Motorcycles: \n");
        for (Motorcycle motorcycle: motorcycles) {
            System.out.println(motorcycle.getName() + ": " + motorcycle.getDistanceTraveled() + " km(s)");
        }
        System.out.println("\n");
        System.out.println("Trucks: \n");
        for (Truck truck: trucks) {
            System.out.println(truck.getName() + ": " + truck.getDistanceTraveled() + " km(s)");
        }
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
