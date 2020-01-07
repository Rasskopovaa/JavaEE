package Lesson4.Course.first;

public class Main {
    public static void main(String[] args) {


        MathBox mathBox = new MathBox();
        mathBox.addDigit(12);
        mathBox.addDigit(13);
        mathBox.addDigit(15);

        System.out.println(mathBox.getSumm());

    }
}