package creational.AbstractFactory;

import creational.AbstractFactory.bike.Bike;
import creational.AbstractFactory.car.Car;
import creational.AbstractFactory.factory.Factory;

public class TransportUser {
    private Car car;
    private Bike bike;

    public TransportUser(Factory factory) {
        car = factory.createCar();
        bike = factory.createBike();
    }

    public void userTransport() {
        car.setup();
        car.wash();
        bike.race();
        bike.repare();
    }
}
