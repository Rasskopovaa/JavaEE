package Lesson6.Course.shop;

public class Store {

    private int products=0;
    public synchronized void get(){
        while(products<1){
            System.out.println("wat for get");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products--;
        System.out.println("Покупатель купил 1 продукт");
        System.out.println("Товаров на складе"+products);
        notify();
    }

public synchronized  void put(){
    while(products>=5){
        System.out.println("wat for put");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    products++;
    System.out.println("ПРоизводитель добавид 1 продукт");
    System.out.println("Товаров на складе"+products);
    notify();

}

}
