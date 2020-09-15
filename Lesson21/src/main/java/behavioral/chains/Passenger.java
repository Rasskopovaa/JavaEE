package behavioral.chains;

public class Passenger {
    private boolean hasDocuments;
    private double cash;
    private boolean hasDrugs;

    public Passenger(boolean hasDocuments, double cash, boolean hasDrugs) {
        this.hasDocuments = hasDocuments;
        this.cash = cash;
        this.hasDrugs = hasDrugs;
    }

    public boolean isHasDocuments() {
        return hasDocuments;
    }

    public double getCash() {
        return cash;
    }

    public boolean isHasDrugs() {
        return hasDrugs;
    }
}
