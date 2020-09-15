package behavioral.chains;

public class CheckDocuments extends Chain {
    @Override
    public boolean check(Passenger passenger) {
        if (passenger.isHasDocuments()) {
            return checkNext(passenger);
        } else {
            return false;
        }
    }
}
