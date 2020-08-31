package creational.factory;

import creational.factory.bikes.ChopperBike;
import creational.factory.bikes.CrossBike;
import creational.factory.bikes.SportBike;

public class Factory {
    public Bikes makeBikes(String type) {
        switch (type) {
            case "sport":
                return new SportBike();
            case "cross":
                return new CrossBike();
            case "chopper":
                return new ChopperBike();
        }
        return null;

    }
}
