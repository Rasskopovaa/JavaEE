package Lesson2.Homework;

import java.lang.reflect.Executable;

public class MathBox {
    public static void main(String[] args) throws Exception {
        MathBox math = new MathBox();

        System.out.println("Summa:" + math.summ(4, 5));

        System.out.println("Difference:" + math.diff(5, 3));

        System.out.println("Divide into 0: " + math.divEX(4, 0));

        try {
            System.out.println("Factorial:");
            math.factorial(Integer.MAX_VALUE);
        } catch (StackOverflowError e) {
            System.out.println("Catched exception: " + e);
        }

        System.out.println("Divide with exception:");
        try {
            System.out.println(math.div(46, 0));
        } catch (NullPointerException e) {
            System.out.println("Catched exception" + e);
        }

    }


    public int summ(int a, int b) {
        return a + b;
    }

    public int diff(int a, int b) {
        return a - b;
    }

    public long factorial(Integer a) {

        return factorial(a - 1) * a;

    }

    public double div(Integer a, Integer b) throws NullPointerException {
        try {
            if (b == 0) throw new ArithmeticException();
            return (double) a / b;
        } catch (ArithmeticException e) {
            throw new NullPointerException(e.getMessage() + " was catched ");
        }
    }

    public double divEX(Integer a, Integer b) {
        try {
            if (b == 0) throw new ArithmeticException();
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return 0;
    }

}

