package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) throws InterruptedException {


        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("start")) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int i = 0; i < 10000; i++) {
                int a = (int) (Math.random() * 111000);
                numbers.add(a);
                Thread.sleep(1000);
                System.out.println(numbers);

                if (numbers.size() == 20) {
                    for (int j = 20; j >= 1; j--) {
                        numbers.remove(j - 1);
                    }
                    System.out.println(numbers);

                }

            }
        }
    }


}