package behavioral.command;

public class AccidentFlash extends Command {
    public AccidentFlash(Bike bike) {
        super(bike);
    }

    @Override
    public boolean execute() {
        bike.setLeftFlash(true);
        bike.setRightFlash(true);
        return false;
    }
}
