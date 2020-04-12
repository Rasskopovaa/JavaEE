package Lesson10.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        Collection<String> strings = Arrays.asList("al","b2","c3","d4","a1","c3");

        /*List<String> distihct = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(distihct); //удаляет дубликаты*/
       /* String [] array = strings.stream().distinct().map(String::toUpperCase).toArray(String[]::new);
        System.out.println(Arrays.asList(array));*/

       String text = strings.stream().collect(Collectors.joining(":","<b>","</b>"));
        System.out.println(text);

    }
}
