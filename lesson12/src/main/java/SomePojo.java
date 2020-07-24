import java.util.Random;

public class SomePojo {
    final Random rd = new Random();
    private  Integer a;
    private String b;
    private Object c;

    public SomePojo() {
        a= rd.nextInt();
        b=String.valueOf(rd.nextInt());
        c= new Object();

    }
}

