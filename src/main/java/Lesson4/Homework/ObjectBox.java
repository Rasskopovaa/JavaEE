package Lesson4.Homework;

import java.util.*;

public class ObjectBox<T> {
    private Set<T> newSet = new TreeSet<T>();

    public ObjectBox(Set<T> newSet){
        this.newSet= newSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectBox<?> objectBox = (ObjectBox<?>) o;
        return Objects.equals(newSet, objectBox.newSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newSet);
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "newSet=" + newSet +
                '}';
    }
    public  void addObj(T obj){
        this.newSet.add(obj);
    }
    public void removeObj(T obj){
        this.newSet.remove(obj);
    }
    public void dump(){
        this.toString();
    }
    public int summator() throws Exception{
        int summ=0;
        if(newSet.iterator().next() instanceof Number){
            for(T number: newSet){
                summ+=Integer.parseInt(number.toString());
            }
        }

        return summ;
    }


    public List<Integer> splitter(int div) throws Exception {
        List<Integer> result = new ArrayList<>();
        if (newSet.iterator().next() instanceof Number) {
            for (T num : newSet) {
                result.add(((Number) num).intValue() / div);
            }
        } else ;
        return result;
    }
}

