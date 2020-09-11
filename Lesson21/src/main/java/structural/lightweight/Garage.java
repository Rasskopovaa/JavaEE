package structural.lightweight;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Bike> bikes = new ArrayList<>();

    public void makeBike(int stateReg, String model, Color color) {

        BikeType type = BikeFactory.getBikeType(model, color);
        Bike bike = new Bike(stateReg, type);

        bikes.add(bike);
    }
}
