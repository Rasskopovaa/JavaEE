package structural.decorater.bikes;

import structural.decorater.Bike;

public class SportBike extends Bike {

    public SportBike() {
        description = "Sport bike";
    }

    @Override
    public double cost() {
        return 5999.99;
    }
}
