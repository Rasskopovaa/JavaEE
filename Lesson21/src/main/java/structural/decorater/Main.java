package structural.decorater;

import structural.decorater.bikes.EnduroBike;
import structural.decorater.bikes.SportBike;
import structural.decorater.decprators.Helmet;
import structural.decorater.decprators.RainCoat;

public class Main {
    public static void main(String[] args) {
        Bike bike = new SportBike();
        System.out.println(bike.getDescription());
        System.out.println(bike.cost());

        System.out.println("________________");
        bike = new EnduroBike();
        bike = new Helmet(new RainCoat(bike));
        System.out.println(bike.getDescription());
        System.out.println(bike.cost());
    }
}
