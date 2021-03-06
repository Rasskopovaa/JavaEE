package Course;

import java.util.*;

public class Main {
 private static Map<Object,Object> cache = new HashMap<>();
private static final int ARRAY_SIZE=1_000;
private static final int MAP_SIZE=1_000_000;


    public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
scanner.next();

createCollectable();
    }
    private static Object createBigObject(){
        List<String> bigArrayList = new ArrayList<>();
        Random rd= new Random();
        for(int i=0;i<ARRAY_SIZE;i++){
            String elem = i+ " : "+ rd.nextInt()+ " ; ";
            bigArrayList.add(elem);
            System.out.println(elem);
        }
        return bigArrayList;
    }
    private static void createCollectable(){
        Map<Object,Object>  localCache =  new HashMap<>();
        for(int i=0;i<MAP_SIZE;i++){
            localCache.put(i,createBigObject());

        }
    }
}
