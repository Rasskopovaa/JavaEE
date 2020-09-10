package structural.decorater.bikes;

import structural.decorater.Bike;

public class EnduroBike extends Bike {

    public EnduroBike() {
        description = "Enduro bike";
    }

    @Override
    public double cost() {
        return 4999.99;
    }
}
