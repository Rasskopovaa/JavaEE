package creational.FactoryMethod;

public abstract class TransportUser {

    private Transport transport;

    public abstract Transport factoryMethod();

    public void userTransporrt() {
        transport = factoryMethod();
        transport.move(15);
        System.out.println("There is " + transport.getPassengers() + " passengers.");
    }
}
