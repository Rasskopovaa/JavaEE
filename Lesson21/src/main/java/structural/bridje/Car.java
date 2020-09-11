package structural.bridje;

public class Car extends Transport {

    public Car(Handler handler) {
        super(handler);
    }

    @Override
    public void workWith() {
        System.out.println("Started workin with car");
        handler.handle();
    }
}
