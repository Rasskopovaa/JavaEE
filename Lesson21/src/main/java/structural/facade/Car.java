package structural.facade;

public class Car {
    String manufacture;

    public Car(String manufacture) {
        this.manufacture = manufacture;
    }

    public void paintBamper() {
        new CarPainterFacade().paint(manufacture);
    }
}
