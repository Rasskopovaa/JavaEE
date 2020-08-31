package creational.factory.bikes;

import creational.factory.Bikes;

public class ChopperBike implements Bikes {
    @Override
    public void start() {
        System.out.println("Chopper engine started");
    }

    @Override
    public void run(Integer km) {
        System.out.println("Chopper bike running " + km + "kilometres");
    }

    @Override
    public void switchoff() {
        System.out.println("Chopper bike switched off");
    }
}
