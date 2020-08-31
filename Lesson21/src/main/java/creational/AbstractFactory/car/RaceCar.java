package creational.AbstractFactory.car;

public class RaceCar implements Car {
    @Override
    public void wash() {
        System.out.println("Мыть гоночную машину");
    }

    @Override
    public void setup() {
        System.out.println("Настроить гоночную машину");
    }
}
