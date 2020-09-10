package structural.decorater.decprators;


import structural.decorater.Bike;
import structural.decorater.Decorator;

public class Helmet extends Decorator {

    private Bike bike;

    public Helmet(Bike bike) {
        this.bike = bike;
    }

    public double cost() {
        return bike.cost() + 80;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + ", with helmet ";
    }
}
