package Lesson10.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

       /* long sumOdd = numbers.stream().collect(Collectors.summingInt((p)->p%2==1?p:0));
        System.out.println(sumOdd);*/
        Map <Boolean, List<Integer>> parts = numbers.stream().collect(Collectors.partitioningBy((p)->p%2==0));
        System.out.println(parts);
    }
}
