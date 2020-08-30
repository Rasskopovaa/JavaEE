package creational.builder;

import creational.builder.bikes.Bike;
import creational.builder.bikes.Pilot;
import creational.builder.builders.BikeBuilder;
import creational.builder.builders.PilotBuilder;
import creational.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        BikeBuilder bikeBuilder = new BikeBuilder();
        director.constructDirtBike(bikeBuilder);
        Bike bike = bikeBuilder.getResult();

        System.out.println("bike built " + bike);

        PilotBuilder pilotBuilder = new PilotBuilder();
        director.constructSportBike(pilotBuilder);
        Pilot pilot = pilotBuilder.getResult();
        System.out.println("pilot built" + pilot);
    }
}
