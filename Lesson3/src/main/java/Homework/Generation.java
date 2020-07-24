package Homework;

import java.util.ArrayList;
import java.util.Random;

public class Generation {
     Generation() {
    }

    public static ArrayList<Integer> generateArrayList( int n) {
        Random random = new Random();
        ArrayList<Integer> arrayRandom = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            Integer r = random.nextInt(100);
            while (arrayRandom.contains(r)) {
                r = random.nextInt(100);
            }
            arrayRandom.add(r);
        }
        return arrayRandom;
    }
    }