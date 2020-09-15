package behavioral.chains;

public class Queue {

    private int capasity;
    private int busy;

    public Queue(int capasity, int busy) {
        this.capasity = capasity;
        this.busy = busy;
    }

    public int getCapasity() {
        return capasity;
    }

    public int getBusy() {
        return busy;
    }
}
