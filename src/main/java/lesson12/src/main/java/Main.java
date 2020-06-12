import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        scanner.nextLine();
        long startTime = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        Random myRand = new Random();
        for(int i=0;i<1_000_000;i++){
            str.replace(0,str.capacity(),String.valueOf(myRand.nextInt()));
            str = str.append( "Это - новое число ");
            str= str.append("которое было выведено на экран");
        }

        System.out.println("Итог");
        System.out.println(System.currentTimeMillis()-startTime);
        System.out.println("мс");
        scanner.nextLine();
    }
}
