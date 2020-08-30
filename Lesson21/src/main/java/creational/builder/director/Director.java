package creational.builder.director;

import creational.builder.bikes.Types;
import creational.builder.bikes.components.Engine;
import creational.builder.bikes.components.Transmission;
import creational.builder.bikes.components.TripComputer;
import creational.builder.builders.Builder;

public class Director {
    public void constructSportBike(Builder builder) {
        builder.setType(Types.SPORT_BIKE);
        builder.setSeats(1);
        builder.setEngine(new Engine(100, 0));
        builder.setTreansmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
    }

    public void constructFitBike(Builder builder) {
        builder.setType(Types.FIR_BIKE);
        builder.setSeats(1);
        builder.setEngine(new Engine(20, 0));
        builder.setTreansmission(Transmission.SINGLE_SPEED);
        builder.setTripComputer(new TripComputer());
    }

    public void constructDirtBike(Builder builder) {
        builder.setType(Types.DIRT_BIKE);
        builder.setSeats(1);
        builder.setEngine(new Engine(50, 0));
        builder.setTreansmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
    }
}