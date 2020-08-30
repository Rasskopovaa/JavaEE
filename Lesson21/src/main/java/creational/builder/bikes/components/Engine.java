package creational.builder.bikes.components;

public class Engine {
    private static boolean started;
    private final double volue;
    private double mileage;

    public Engine(double volue, double mileage) {
        this.volue = volue;
        this.mileage = mileage;
    }

    public static void on() {
        started = true;
    }

    public static void off() {
        started = false;
    }

    public static boolean isStarted() {
        return started;
    }

    public double getVolue() {
        return volue;
    }

    public double getMileage() {
        return mileage;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go!");
        }
    }
}
