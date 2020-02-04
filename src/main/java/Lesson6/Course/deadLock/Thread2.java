package Lesson6.Course.deadLock;

public class Thread2 extends Thread {
    Object resource1;
    Object resource2;
    public Thread2(Object resource1, Object resource2){
        this.resource1=resource1;
        this.resource2=resource2;


    }

    public void run(){
        synchronized (resource1){

            System.out.println("resource1 locked by thread1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (resource2){
                System.out.println("resource1 locked by thread1");
            }
        }
    }


}
