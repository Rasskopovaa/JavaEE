package structural.adapter;

public class Bike {
    private String weight;

    public Bike(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void raceto(String destination, int speed) {
        System.out.println("Мотоцикл едет, назначение - " + destination + ", скорость - " + speed);
    }
}
