package Course.shop;

public class consume  implements Runnable{
    Store store;

    public consume(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            store.get();
        }
    }
}
