package Homework;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Integer [] array={2,44,22};
        List<Integer> list = Arrays.asList(array);
        ObjectBox objectBox = new ObjectBox<Integer>(new TreeSet(list));
        objectBox.dump();

        objectBox.addObj(45);
        objectBox.dump();

        objectBox.removeObj(44);
        objectBox.dump();

        try{
            System.out.println(objectBox.summator());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            System.out.println(objectBox.splitter(3));
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
