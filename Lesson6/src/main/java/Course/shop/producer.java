package Course.shop;

public class producer implements Runnable {
    Store store;

    public producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
 for(int i=0;i<20;i++){
     store.put();
 }
    }
}
