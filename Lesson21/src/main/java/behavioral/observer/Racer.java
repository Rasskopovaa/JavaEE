package behavioral.observer;

public class Racer implements Subscriber {
    String name;

    public Racer(String name) {
        this.name = name;
    }

    @Override
    public void update(Race race) {
        System.out.println("Racer " + name + "is going to race on " + race.getInfo());

    }
}
