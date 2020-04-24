package Lesson10.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*String [] array = {"a1","a2","a3","a4"};
        Stream<String> stream = Arrays.stream(array);*/
        File file = new File("1.tmp");
        file.deleteOnExit();
        PrintWriter out = null;
        try {
            out = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        out.println("a1");
        out.println("a2");
        out.println("a3");
        out.println("a4");
        out.close();

        Stream<String> stream= null;
        try {
            stream = Files.lines(Paths.get(file.getAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Stream: "+ stream.collect(Collectors.toList()));
    }
}
