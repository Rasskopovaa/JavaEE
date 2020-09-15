package behavioral.command;

public class LeftFlash extends Command {
    public LeftFlash(Bike bike) {
        super(bike);
    }

    @Override
    public boolean execute() {
        allOff();
        bike.setLeftFlash(true);
        return false;
    }
}
