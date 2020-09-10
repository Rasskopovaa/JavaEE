package structural.adapter;

public class BikeAdapter implements Car {
    private Bike bike;

    public BikeAdapter(Bike bike) {
        this.bike = bike;
    }


    @Override
    public void driveTo(String destination) {
        bike.raceto(destination, 3);
    }

    @Override
    public double getWeight() {
        return Double.valueOf(bike.getWeight());
    }
}
