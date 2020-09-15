package behavioral.chains;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(true, 1000, false);
        Queue queue = new Queue(10, 2);

        Chain canPassengerFly = new CanEnterQueue(queue);
        canPassengerFly.linkWith(

                new CheckChain().linkWith(
                        new CheckDocuments().linkWith(
                                new CheckDrugs()
                        )
                )
        );
        System.out.println(canPassengerFly.check(passenger));
    }
}
