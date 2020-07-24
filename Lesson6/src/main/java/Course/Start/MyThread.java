package Course.Start;

public class MyThread extends Thread {
    String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        int  iteration= 5_000_000;
        double sum = 0;
        for (int i = 1; i < iteration; i++) {
            sum += 10000 / i;
        }
        System.out.println(sum);
    }
}
