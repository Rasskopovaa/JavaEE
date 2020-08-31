package creational.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Bikes chopper = factory.makeBikes("chopper");
        chopper.run(14);
    }
}
