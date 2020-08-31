package creational.factory.bikes;

import creational.factory.Bikes;

public class CrossBike implements Bikes {
    @Override
    public void start() {
        System.out.println("Cross engine started");
    }

    @Override
    public void run(Integer km) {
        System.out.println("Cross bike running " + km + "kilometres");
    }

    @Override
    public void switchoff() {
        System.out.println("Cross bike switched off");
    }
}
