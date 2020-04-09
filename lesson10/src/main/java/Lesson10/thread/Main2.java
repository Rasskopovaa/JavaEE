package Lesson10.thread;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("This message from Lesson10.thread.Main");

        new Thread(
                ()-> System.out.println("Message from Thread")

        ).start();
    }
}