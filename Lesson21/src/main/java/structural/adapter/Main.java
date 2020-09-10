package structural.adapter;

public class Main {
    public static void main(String[] args) {
        CarCarrier carCarrier = new CarCarrierImpl(1.5);
        Car car = new CarImpl(1.9);

        if (carCarrier.transportCar(car)) {
            System.out.println("Успещно перевезли ");
        } else {
            System.out.println("Перевозка не удалась");

        }


        Bike bike = new Bike("0.5");
        bike.raceto("Some", 100);

        if (carCarrier.transportCar(new BikeAdapter(bike))) {
            System.out.println("Успещно перевезли ");
        } else {
            System.out.println("Перевозка не удалась");

        }
    }
}
