import java.util.ArrayList;

public class MainThread {
    public static void main(String[] args) {
        ArrayList<Thread> threads= new ArrayList<>();
        Thread largeThread = new Thread (new NormalThread(100,20_000,2_000));
        Thread mediumThread2 = new Thread (new NormalThread(100,5_000,2_000));
        Thread smallhread3 = new Thread (new NormalThread(100,1_000,2_000));
        threads.add(largeThread);
        threads.add(mediumThread2);
        threads.add(smallhread3);
        for( Thread thread: threads){
            thread.start();

        }
    }
}
