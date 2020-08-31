package creational.AbstractFactory.factory;

import creational.AbstractFactory.bike.Bike;
import creational.AbstractFactory.bike.CrossBike;
import creational.AbstractFactory.car.Car;
import creational.AbstractFactory.car.OffroadCar;

public class OffroadFactory extends Factory {
    @Override
    public Car createCar() {
        return new OffroadCar();
    }

    @Override
    public Bike createBike() {
        return new CrossBike();
    }
}
