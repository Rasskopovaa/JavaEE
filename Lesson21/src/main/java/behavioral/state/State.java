package behavioral.state;

public abstract class State {

    public Bike bike;

    public State() {
    }

    public State(Bike bike) {
        this.bike = bike;
    }

    public abstract void onState();

    public abstract void onRide();

    public abstract void onArrive();

    public abstract void onOff();


}
