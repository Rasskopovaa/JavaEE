package structural.decorater.decprators;

import structural.decorater.Bike;
import structural.decorater.Decorator;

public class RaceTypes extends Decorator {

    private Bike bike;

    public RaceTypes(Bike bike) {
        this.bike = bike;
    }

    public double cost() {
        return bike.cost() + 400;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + ", with race types";
    }
}
