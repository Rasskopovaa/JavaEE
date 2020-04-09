package Lesson10.functional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свою зарплату");
        Integer salary = scanner.nextInt();
        System.out.println("Введите страну");
        scanner.nextLine();
        String country = scanner.nextLine();

        TexCalculator taxCalc = null;
        switch(country){
            case "Russia":
                taxCalc=(int summ)->{return summ*0.13;};
                break;
            case "USA":
                taxCalc=summ-> summ*0.26;
                break;
            case "Angola":
                taxCalc=(int summ)->{return summ*0.38;};
                break;
                default:
                taxCalc=(int summ)->{return summ*0.13;};
                break;


        }System.out.println(taxCalc.calculateTzx(salary));
    }
}
