package creational.builder.builders;

import creational.builder.bikes.Bike;
import creational.builder.bikes.Types;
import creational.builder.bikes.components.Engine;
import creational.builder.bikes.components.Transmission;
import creational.builder.bikes.components.TripComputer;

public class BikeBuilder implements Builder {
    private Types type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;

    @Override
    public void setType(Types type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTreansmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Bike getResult() {
        return new Bike(type, seats, engine, transmission, tripComputer);
    }
}
