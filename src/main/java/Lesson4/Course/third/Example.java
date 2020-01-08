package Lesson4.Course.third;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Object> myList= new ArrayList<>();
        myList.add(12);
        myList.add(24);
        dump(myList);

        List<Integer> myList2 = new ArrayList<>();
        myList.add(12);
        myList2.add(124);
        //   dump(myList2);Ошибка, так как указан Integer, а не Object, поэтомму используем wildcard
    }



    /*static void dump(Collection<Object> o ){
        for(Iterator <Object> i = o.iterator();i.hasNext();){
            Object obj = i.next();
            System.out.println(obj);
        }
    }
    */
    static void dump(Collection<?> o ) {
        for (Iterator<?> i = o.iterator(); i.hasNext(); ) {
            Object obj = i.next();
            System.out.println(obj);
        }
    }
}