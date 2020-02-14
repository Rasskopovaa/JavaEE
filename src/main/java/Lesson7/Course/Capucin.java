package Lesson7.Course;

import Lesson7.Course.Monkey;

public class Capucin extends Monkey {
    public int charming;
    protected int harfull;
    private int footSize;
    private final int tailLenght =40;

    public Capucin(int charming, int harfull, int footSize) {
        this.charming = charming;
        this.harfull = harfull;
        this.footSize = footSize;
    }

    public Capucin(int charming) {
        this.charming = charming;
        this.footSize=30;
        this.harfull=1;
    }

    public Capucin() {
    }
    protected  void washFce(){
        System.out.println("Face cleaned");
    }
    private void washEars(){
        System.out.println("Ears washed");
    }
    public void eatBananas(int count){
        System.out.println("Ate"+ count + "bananas");
    }
}
