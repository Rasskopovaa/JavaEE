package structural.lightweight;

import java.awt.*;

public class BikeType {
    private String model;
    private Color color;

    public BikeType(String model, Color color) {
        this.model = model;
        this.color = color;
        print(0);
    }

    public void print(int stateReg) {
        System.out.println(stateReg + " " + model + " " + color);
    }
}
