package creational.FactoryMethod;

public class Car implements Transport {
    private static final Integer PASSENGERS = 5;

    @Override
    public void move(Integer km) {
        System.out.println("Car is riding for " + km + "kilometres");
    }

    @Override
    public Integer getPassengers() {
        return PASSENGERS;
    }
}
