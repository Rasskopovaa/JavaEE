package creational.FactoryMethod;

public class Bike implements Transport {
    private static final Integer PASSENGERS = 2;

    @Override
    public void move(Integer km) {
        System.out.println("Bike is riding for " + km + "kilometres");
    }

    @Override
    public Integer getPassengers() {
        return PASSENGERS;
    }
}
