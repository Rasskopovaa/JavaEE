package behavioral.command;

public class RightFlesh extends Command {
    public RightFlesh(Bike bike) {
        super(bike);
    }

    @Override
    public boolean execute() {
        allOff();
        bike.setRightFlash(true);
        return false;
    }
}

