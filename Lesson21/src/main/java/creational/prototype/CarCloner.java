package creational.prototype;

public class CarCloner {
    private Car car;

    public CarCloner(Car car) {
        this.car = car;

    }

    public Car copyCar() throws CloneNotSupportedException {
        return (Car) this.car.clone();
    }

}
