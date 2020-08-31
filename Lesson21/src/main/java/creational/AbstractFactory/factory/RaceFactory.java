package creational.AbstractFactory.factory;

import creational.AbstractFactory.bike.Bike;
import creational.AbstractFactory.bike.SportBike;
import creational.AbstractFactory.car.Car;
import creational.AbstractFactory.car.RaceCar;

public class RaceFactory extends Factory {
    @Override
    public Car createCar() {
        return new RaceCar();
    }

    @Override
    public Bike createBike() {
        return new SportBike();
    }
}
