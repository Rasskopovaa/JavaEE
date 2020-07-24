import java.util.ArrayList;

import static java.lang.Thread.sleep;
public class NormalThread  implements Runnable{
    private int period=100;
    private int increment = 5_000;
    private int threshold=2_000;
    private boolean stopTime= false;
    private ArrayList<SomePojo> leakableCollection;

    public NormalThread(int period, int increment, int threshold) {
        this.period = period;
        this.increment = increment;
        this.threshold = threshold;
        this.leakableCollection = new ArrayList<>();
    }

    @Override
    public void run() {
        while (!stopTime){
            int j=0;
            try{
                sleep(period);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=0;i<increment;i++){
                SomePojo somePojo = new SomePojo();
                somePojo=null;
                leakableCollection.add(somePojo);
                j++;
            }
            System.out.println("Thread "+ Thread.currentThread().getName() + "collize" + leakableCollection.size());
        }
    }
}
