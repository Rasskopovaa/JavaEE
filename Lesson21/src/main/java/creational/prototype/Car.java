package creational.prototype;

public class Car implements Cloneable {
    private String stRegNum;

    public Car(String stRegNum) {
        this.stRegNum = stRegNum;
    }

    public String getStRegNum() {
        return stRegNum;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "stRegNum='" + stRegNum + '\'' +
                '}';
    }
}
