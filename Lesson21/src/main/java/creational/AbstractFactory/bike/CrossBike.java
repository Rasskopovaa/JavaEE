package creational.AbstractFactory.bike;

public class CrossBike implements Bike {
    @Override
    public void repare() {
        System.out.println(" ремонтировать кросс-байк");
    }

    @Override
    public void race() {
        System.out.println(" гонки на кросс-байке");
    }
}
