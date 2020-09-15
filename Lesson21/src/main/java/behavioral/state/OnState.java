package behavioral.state;

public class OnState extends State {

    public OnState(Bike bike) {
        super(bike);
    }

    @Override
    public void onState() {
        System.out.println("FAIL - already on");
    }

    @Override
    public void onRide() {
        bike.setRiding(true);
        bike.changeState(new RidingState(bike));
        System.out.println("SUCCESS - have a nice trio");
    }

    @Override
    public void onArrive() {
        System.out.println("FAIL - didn't run");
    }

    @Override
    public void onOff() {
        bike.setEngineRunning(false);
        bike.changeState(new OffState(bike));
        System.out.println("SUCCESS - sxwitched off");
    }
}
