package creational.FactoryMethod;

public class BikeCreator extends TransportUser {
    @Override
    public Transport factoryMethod() {
        return new Bike();
    }
}
