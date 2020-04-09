package Lesson10.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("This message from Lesson10.thread.Main");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("message fron Thread");
            }
        }).start();
    }
}
