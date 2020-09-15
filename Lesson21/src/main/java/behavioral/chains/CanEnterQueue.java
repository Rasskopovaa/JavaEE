package behavioral.chains;

public class CanEnterQueue extends Chain {
    private Queue queue;

    public CanEnterQueue(Queue queue) {
        this.queue = queue;
    }

    @Override
    public boolean check(Passenger passenger) {
        if (queue.getCapasity() > queue.getBusy()) {
            return checkNext(passenger);
        } else {
            return false;
        }
    }
}
