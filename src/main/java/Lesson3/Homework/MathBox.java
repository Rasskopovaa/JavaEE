package Lesson3.Homework;

import java.util.*;

public class MathBox {


    private ArrayList<Integer> arrayList;


    public MathBox(Integer[] array) {
        List myList = Arrays.asList(array);// asList преобразует элементы массива в список
        this.arrayList = new ArrayList<>(myList);
    }

    public MathBox(List<Integer>myList ){

        this.arrayList=new ArrayList<>(myList);
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
    public int summator (){

        int summa=0;
        for(int numbero:arrayList){
            summa+=numbero;
        }
        return summa;
    }
 // метод,выполняющий поочередное деление всех хранящихся в объекте элементов на делитель,являющийся аргументом метода
    public List <Integer> splitter(int t){
        ArrayList<Integer> arr= new ArrayList<>();
        for (int numberro : arrayList) {
            arr.add(numberro / t);
        }
        return arr;
    }


    public List<Integer> delete (int deleteNum) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int numberro : arrayList) {
            if (numberro == deleteNum) {
                System.out.println("Элемент" +" "+ deleteNum +" "+"удален, так как подобное число в массиве уже есть");
            } else {
                arr.add(numberro);
            }
        }
        return arr;
    }

}

