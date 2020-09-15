package behavioral.observer;

public interface Publisher {
    void addRacer(Racer racer);

    void deleteRacer(Racer racer);

    void notifyRacer(Race race);
}
