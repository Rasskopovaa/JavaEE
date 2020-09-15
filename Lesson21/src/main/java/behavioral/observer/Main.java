package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Publisher raceInformator = new PublisherImpl();

        Racer racer = new Racer(" Alex Feduchiny");
        raceInformator.addRacer(racer);
        racer = new Racer(" Nikols Deds");
        raceInformator.addRacer(racer);
        racer = new Racer(" Max Maximus");
        raceInformator.addRacer(racer);
        racer = new Racer(" Kirill Lapenko");
        raceInformator.addRacer(racer);
        raceInformator.notifyRacer(new Race(" Monra, 10th of September"));


        System.out.println("k");
        raceInformator.deleteRacer(racer);

        raceInformator.notifyRacer(new Race("Scruka 12th of October"));
    }
}
