package creational.AbstractFactory.factory;


import creational.AbstractFactory.bike.Bike;
import creational.AbstractFactory.car.Car;


public abstract class Factory {
    public abstract Car createCar();

    public abstract Bike createBike();

}
