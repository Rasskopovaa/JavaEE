package Lesson3.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int arraysize = 10;
        solutionViaArrayList(arraysize);
    }
        public static void solutionViaArrayList(int arraysize) {

        ArrayList<Integer> list =Generation.generateArrayList(arraysize);
            System.out.println("Выводим список  размером " + list.size() + " элементов: ");
        for (int i : list) {
            System.out.println(i + " ");
        }

        MathBox mathBox = new MathBox(list);

            System.out.println("\nВыводим toString:");
            System.out.println(mathBox.toString());

            System.out.println("Выводим summator:");
            System.out.println(mathBox.summator());

            System.out.println("Выводим splitter:");
            System.out.println(mathBox.splitter(4));

            System.out.println("Выводим список без повторяющегося числа:");
            System.out.println(mathBox.delete(5));
    }
}


