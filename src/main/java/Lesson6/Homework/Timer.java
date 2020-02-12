package Lesson6.Homework;

public class Timer implements Runnable{

 private int period;
    private Thread t = new Thread(this);

    Timer(int period) {
        this.period = period;
        t.start();
    }
    public int getPeriod() {
        return period;
    }

    @Override
    public void run() {
        try{
            while(true){
                Thread.sleep(1000);
                synchronized (Message.class){
                    Message.sendMessage(Integer.toString(++Message.count));
                    Message.class.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
