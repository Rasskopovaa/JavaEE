package behavioral.chains;

public abstract class Chain {
    private Chain next;

    public abstract boolean check(Passenger passenger);

    public Chain linkWith(Chain next) {
        this.next = next;
        return this;
    }

    public boolean checkNext(Passenger passenger) {
        if (next == null) {
            return true;
        } else {
            return next.check(passenger);
        }
    }
}
