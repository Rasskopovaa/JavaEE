package creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        TransportUser[] transportUsers = {new CarCreator(), new BikeCreator()};

        for (TransportUser transportUser : transportUsers) {
            transportUser.userTransporrt();
        }
    }
}
