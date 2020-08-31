package creational.factory.bikes;

import creational.factory.Bikes;

public class SportBike implements Bikes {
    @Override
    public void start() {
        System.out.println("Sport engine started");
    }

    @Override
    public void run(Integer km) {
        System.out.println("Sport bike running " + km + "kilometres");
    }

    @Override
    public void switchoff() {
        System.out.println("Sport bike switched off");
    }
}
