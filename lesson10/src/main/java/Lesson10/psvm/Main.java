package Lesson10.psvm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8);

       /* for(int number: numbers)//обычный вывод
            System.out.println(number);*/
       numbers.forEach((Integer value)-> System.out.println(value));//лямбда выржаения

        numbers.forEach( value-> System.out.println(value));//если извествен тип аргумента, можно сделать так

        numbers.forEach(System.out::println);

        }

    }

