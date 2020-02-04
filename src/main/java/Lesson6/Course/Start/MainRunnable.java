package Lesson6.Course.Start;

public class MainRunnable {
    public static void main(String[] args) throws InterruptedException {
        MyRannable myRannable1 = new MyRannable();
        MyRannable myRannable2 = new MyRannable();

        Thread thread1 = new Thread(myRannable1);
        Thread thread2 = new Thread(myRannable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Завершение");
    }
}
