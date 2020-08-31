package creational.AbstractFactory;

import creational.AbstractFactory.factory.OffroadFactory;
import creational.AbstractFactory.factory.RaceFactory;

public class Main {
    public static void main(String[] args) {
        TransportUser transportUser = new TransportUser(new OffroadFactory());
        transportUser.userTransport();
        System.out.println("_____________________");
        transportUser = new TransportUser(new RaceFactory());
        transportUser.userTransport();
    }
}
