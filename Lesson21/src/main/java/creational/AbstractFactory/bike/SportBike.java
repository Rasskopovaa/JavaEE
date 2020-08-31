package creational.AbstractFactory.bike;

public class SportBike implements Bike {
    @Override
    public void repare() {
        System.out.println("ремонтировать спортбайк");
    }

    @Override
    public void race() {
        System.out.println(" гонки на спорт-байке");
    }
}
