package creational.builder.bikes.components;

import creational.builder.bikes.Bike;

public class TripComputer {
    public void condition() {
        if (Engine.isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car is off");
        }
    }

    public void fuelLevel() {
        System.out.println("Level of fuel - " + Bike.getFuel());
    }
}
