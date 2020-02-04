package Lesson6.Course.inter;

import java.util.Random;

public class InterputThread extends Thread{
    /*boolean inter= false;
    public void setInter(boolean inter){
        this.inter=inter;
    }*/

    @Override
    public void run() {
        do{
            long sum =0;
            Random random = new Random();
            for(int i=0;i<100;i++){
                sum+=random.nextInt();
            }
        }//while(!inter);
        while(this.isInterrupted());
        System.out.println("Thread stopped");
    }
}
