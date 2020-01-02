package Lesson2.Course;

public class Someclass {
    int myInt = 25;

    public int test(){
        int li=0;
        for(int i=0;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
            li=i;
        }
        return li;
    }
}
