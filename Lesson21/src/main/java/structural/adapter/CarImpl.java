package structural.adapter;

public class CarImpl implements Car {
    private double weight;

    public CarImpl(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void driveTo(String destination) {
        System.out.println(" Машина едет, цель " + destination);
    }
}
