package creational.builder.bikes;


import creational.builder.bikes.components.Engine;
import creational.builder.bikes.components.Transmission;
import creational.builder.bikes.components.TripComputer;

public class Bike {
    private static double fuel = 0;
    private final Types type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;

    public Bike(Types type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
    }

    public static double getFuel() {
        return fuel;
    }

    public Types getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "type=" + type +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                '}';
    }
}
