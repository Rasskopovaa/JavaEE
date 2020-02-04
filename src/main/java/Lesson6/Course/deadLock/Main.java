package Lesson6.Course.deadLock;

public class Main {
    public static void main(String[] args) {
        final Object resource1 = new Object();
        final Object resource2 = new Object();
        Thread1 thread1= new Thread1(resource1,resource2);
        Thread2 thread2= new Thread2(resource1,resource2);
        thread1.start();
        thread2.start();
    }
}
