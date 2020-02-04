package Lesson6.Course.synchro;

public class MonitorThread extends Thread {
    Object monitor;

    public void setMonitor(Object monitor) {
        this.monitor = monitor;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" started");
        synchronized (monitor){
            System.out.println(Thread.currentThread().getName()+"locked monitor");
            try {
                Thread.sleep(300);
            }
            catch(InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"relessing monitor");}
    }
}
