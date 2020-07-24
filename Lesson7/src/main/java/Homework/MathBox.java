package Homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Logging
public class MathBox <T extends Number> {
    private ArrayList<T> arrayList;


    public MathBox(T[] array) {
        List myList = Arrays.asList(array);// asList преобразует элементы массива в список
        this.arrayList = new ArrayList<>(myList);
    }

    public MathBox(List<T> myList) {

        this.arrayList = new ArrayList<>(myList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(arrayList, mathBox.arrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayList);
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "arrayList=" + arrayList +
                '}';
    }

    //метод, возвращающий сумму всех элементов коллекции
    public int summator() {

        int summa = 0;
        for (T numbero : arrayList) {
            summa += numbero.intValue();
        }
        return summa;
    }

    // метод,выполняющий поочередное деление всех хранящихся в объекте элементов на делитель,являющийся аргументом метода
    public List<Integer> splitter(int t) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (T numberro : arrayList) {
            arr.add(numberro.intValue() / t);
        }
        return arr;
    }

 @ClearData
    public List<Integer> delete(int deleteNum) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (T numberro : arrayList) {
            if (numberro.intValue() == deleteNum) {
                System.out.println("Элемент" + " " + deleteNum + " " + "удален, так как подобное число в массиве уже есть");
            } else {
                arr.add(numberro.intValue());
            }


        }
        return arr;
    }

}

