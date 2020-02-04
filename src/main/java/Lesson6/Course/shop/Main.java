package Lesson6.Course.shop;

import com.oracle.jrockit.jfr.Producer;

public class Main {
    public static void main(String[] args) {


        Store store = new Store();
        producer producer = new producer(store);
        consume consume = new consume(store);
         new Thread(producer).start();
         new Thread(consume).start();
         new Thread(producer).start();
        new Thread(consume).start();

    }
}
