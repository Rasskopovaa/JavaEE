package structural.lightweight;

public class Bike {
    private int stateReg;
    private BikeType type;

    public Bike(int stateReg, BikeType type) {
        this.stateReg = stateReg;
        this.type = type;
    }

    public void print() {
        type.print(stateReg);
    }
}


