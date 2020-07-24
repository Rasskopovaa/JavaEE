package Course;

import java.util.Random;
import java.util.TreeMap;

public class TreePro {
    private TreeMap treeMap= new TreeMap();

    public TreePro() {
        generate(20);
    }
    public  void generate(int count) {
        int gen;
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            gen = random.nextInt(100);
            treeMap.put(gen, String.valueOf(gen));
        }
    }
        public void print(){
            for(Object ob: treeMap.values()){
                System.out.println(ob);
            }
        }
    }

