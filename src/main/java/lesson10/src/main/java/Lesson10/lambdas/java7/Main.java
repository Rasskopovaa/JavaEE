package Lesson10.lambdas.java7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свою зарплату");
        Integer salary = scanner.nextInt();
        System.out.println("Введите страну");
        scanner.nextLine();
        String country = scanner.nextLine();

        NonFuncTaxCalc taxCalc = null;
        switch(country){
           case "Russia":
            taxCalc = new NonFuncTaxCalc() {
                @Override
                public double calculateTzx(int summ) {
                    return summ*0.13;
                }
            };
            break;
            case "USA":
                taxCalc = new NonFuncTaxCalc() {
                    @Override
                    public double calculateTzx(int summ) {
                        return summ*0.20;
                    }
                };
                break;
            case "Angola":
                taxCalc = new NonFuncTaxCalc() {
                    @Override
                    public double calculateTzx(int summ) {
                        return summ*0.40;
                    }
                };
                break;
                default:
                taxCalc = new NonFuncTaxCalc() {
                    @Override
                    public double calculateTzx(int summ) {
                        return summ*0;
                    }
                };
                break;
        }
        System.out.println(taxCalc.calculateTzx(salary));


    }
}
