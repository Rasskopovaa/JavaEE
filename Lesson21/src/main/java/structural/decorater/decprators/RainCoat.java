package structural.decorater.decprators;

import structural.decorater.Bike;
import structural.decorater.Decorator;

public class RainCoat extends Decorator {
    private Bike bike;

    public RainCoat(Bike bike) {
        this.bike = bike;
    }

    public double cost() {
        return bike.cost() + 150;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + ", with rain coat";
    }
}

