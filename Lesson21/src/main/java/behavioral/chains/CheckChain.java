package behavioral.chains;

public class CheckChain extends Chain {

    private static final double MAX_CASH = 5_000;

    @Override
    public boolean check(Passenger passenger) {
        if (passenger.getCash() > MAX_CASH) {
            return false;
        } else {
            return checkNext(passenger);
        }
    }
}
