package structural.adapter;

public class CarCarrierImpl implements CarCarrier {
    private double carWeight;

    public CarCarrierImpl(double carWeight) {
        this.carWeight = carWeight;
    }

    public double getCarWeight() {
        return carWeight;
    }

    @Override
    public boolean transportCar(Car car) {
        boolean result = false;
        if (this.carWeight < car.getWeight()) {
            return false;
        }
        car.driveTo(" Заехать на автовоз");
        System.out.println(" Автовоз завозит машинку");
        car.driveTo("Съехать с автовоза");
        return true;
    }
}
