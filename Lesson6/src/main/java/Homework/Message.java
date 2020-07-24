package Homework;

public class Message {
    static volatile int count = 0;

     synchronized static void sendMessage(String s){
         System.out.println(s);
     }

}
