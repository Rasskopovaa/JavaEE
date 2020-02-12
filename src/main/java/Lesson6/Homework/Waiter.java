package Lesson6.Homework;

public class Waiter implements Runnable {
  private int period;
  private String mess;
  private Thread t = new Thread(this);

  Waiter(int period, String mess) {
        this.period = period;
        this.mess = mess;
        t.start();
    }

    @Override
    public void run() {
      try{
          while(true){
              synchronized (Message.class){
                  Message.class.wait();
                  if(Message.count%period==0)
                  Message.sendMessage(mess);
              }
          }
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

    }
}
