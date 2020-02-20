package Lesson7.Homework;



import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inpNumbers = {23,12,234,56,88};
        Integer[] inpArray = Arrays.stream(inpNumbers).boxed().toArray(Integer[]::new); //интерфейс API, который выполняет упаковку и преобразование
        // то же самое  int[]number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //
        //    List<Integer> list = new ArrayList<>();
        //    for (int i : number) {
        //        list.add(i);
        //    }

        MathBox<Integer> mathBox = new MathBox(inpArray);


        MathBox<Integer> proxedMathBox = (MathBox<Integer>) Proxy.newProxyInstance(
                InvokationHandler.class.getClassLoader(), new Class[]{MathBox.class}, new InvokationHandler<Integer>());



        System.out.println("\nВыводим toString:");
        System.out.println(mathBox.toString());

        System.out.println("Выводим summator:");
        System.out.println(mathBox.summator());

        System.out.println("Выводим splitter:");
        System.out.println(mathBox.splitter(4));

        System.out.println("Выводим список без повторяющегося числа:");
        System.out.println(mathBox.delete(5));

}}



