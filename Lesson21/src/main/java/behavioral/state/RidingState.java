package behavioral.state;

public class RidingState extends State {

    public RidingState(Bike bike) {
        super(bike);
    }

    @Override
    public void onState() {
        System.out.println("FAIL - already running");
    }

    @Override
    public void onRide() {
        System.out.println("FAIL - already running");
    }

    @Override
    public void onArrive() {
        bike.setRiding(false);
        bike.changeState(new ArriveState(bike));
        System.out.println("SUCCESS - arrived");
    }

    @Override
    public void onOff() {
        System.out.println("FAIL - no engine stop while riding ");
    }
}
