package Lesson10.lambdas.thread;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("This message from Lesson10.lambdas.thread.Main");

        new Thread(
                ()-> System.out.println("Message from Thread")

        ).start();
    }
}