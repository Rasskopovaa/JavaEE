package structural.facade;

public class CarPainterFacade {
    public void paint(String manufacture) {
        CarMechanic carMechanic = new CarMechanic();
        if (carMechanic.PullOffBumper(manufacture)) {
            CarPainter carPainter = new CarPainter();
            if (carPainter.paintBumper(manufacture)) {
                QuallityController quallityController = new QuallityController();
                if (quallityController.check()) {
                    System.out.println("Бампер покрашен");
                    return;
                }
            }
        }
        System.out.println("Неудачная покраска");

    }
}
