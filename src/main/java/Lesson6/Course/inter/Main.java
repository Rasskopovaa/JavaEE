package Lesson6.Course.inter;

public class Main {
    public static void main(String[] args) {
        InterputThread thread= new InterputThread();
        thread.start();
        System.out.println("Thread started");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("now try to stop");
        //thread.setInter(true);
        thread.interrupt();
    }
}
