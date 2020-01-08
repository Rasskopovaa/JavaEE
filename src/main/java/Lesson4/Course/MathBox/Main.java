package Lesson4.Course.MathBox;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Object [] myArray = {1,4,2,6,7};
        MathBox mathBox= new MathBox(myArray);
        System.out.println(mathBox.summator());
    }
}
