package Course.MathBox;

import java.util.ArrayList;
import java.util.List;

public class MathBox {
    List<Object> myList = new ArrayList<>();

    public MathBox(Object array []) {
        for(int i=0;i<array.length;i++){
            myList.add(array[i]);
        }
    }
    public void addItem(Object o){
        myList.add(o);
    }
    public int summator(){
        int sum=0;
         for(int i=0;i<myList.size();i++) {
             try {
                 sum += (int) myList.get(i);
             }catch(ClassCastException ex){
                 System.out.println("Error"+" "+ex);
         }
        }
         return  sum;
    }
}
