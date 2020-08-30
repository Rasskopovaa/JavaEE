package creational.builder.bikes;

import creational.builder.bikes.components.Engine;
import creational.builder.bikes.components.Transmission;
import creational.builder.bikes.components.TripComputer;

public class Pilot {
    private final Types type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;

    public Pilot(Types type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "type=" + type +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                '}';
    }
}
