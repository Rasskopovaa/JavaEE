package structural.bridje;

public class Bike extends Transport {
    public Bike(Handler handler) {
        super(handler);
    }

    @Override
    public void workWith() {
        System.out.println("Work with bike started");
        handler.handle();

    }
}
