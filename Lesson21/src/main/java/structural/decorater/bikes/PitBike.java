package structural.decorater.bikes;

import structural.decorater.Bike;

public class PitBike extends Bike {

    public PitBike() {
        description = "Pit Bike";
    }

    @Override
    public double cost() {
        return 1999.99;
    }
}
