package creational.prototype;

public class OffroadCar extends Car {
    double wheelSize;

    public OffroadCar(String stRegNum, double wheelSize) {
        super(stRegNum);
        this.wheelSize = wheelSize;
    }

    public double getWheelSize() {
        return wheelSize;
    }

    @Override
    public String toString() {
        return "OffroadCar{" +
                "wheelSize=" + wheelSize +
                "stRegNum=" + getStRegNum() +
                '}'
                ;
    }
}
