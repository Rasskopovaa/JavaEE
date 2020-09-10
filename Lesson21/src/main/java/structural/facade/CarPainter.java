package structural.facade;

public class CarPainter {

    public boolean paintBumper(String carName) {
        if ("Renault".equals(carName)) {
            return true;
        }
        return false;
    }
}
