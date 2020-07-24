package Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sort {
    private List listCol = new ArrayList();

    Sort(){
        this.gen();
    }

    public void gen (){
        Random a= new Random();
        for(int i=0;i<=20;i++)
            this.listCol.add(a.nextInt(100));
    }
    public void myPrint(){
        for(Object number: listCol){
            System.out.println(number);
        }
    }

    public void sort(){
        listCol.sort(new myComp());

             }
         }

