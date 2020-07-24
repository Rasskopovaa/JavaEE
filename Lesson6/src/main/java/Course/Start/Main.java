package Course.Start;

public class Main {
        public static void main(String[] args) throws InterruptedException {
            long starting = System.currentTimeMillis();
            MyThread myThread1 = new MyThread("Thread1");
            MyThread myThread2 = new MyThread("Thread2");
            MyThread myThread3 = new MyThread("Thread3");
            MyThread myThread4 = new MyThread("Thread4");

            myThread1.start();
            myThread2.start();
            myThread3.start();
            myThread4.start();

            myThread1.join();
            myThread2.join();
            myThread3.join();
            myThread4.join();


            System.out.println(System.currentTimeMillis() - starting);
            System.out.println("Завершение основного потока");

        }
    }

