package springData;

import javax.annotation.PostConstruct;

@Profiling
public class SomeImpl implements Some {
    @RandomInt(min = 1, max = 5)
    private int repeat;
    private String text = " Some text ";

    public SomeImpl() {
        System.out.println("Random from constructor  = " + repeat);
    }

    @PostConstruct
    public void init() {
        System.out.println("Random from PostConstruct" + repeat);
    }

    @Override
    public void doSome() {


        try {
            for (int i = 0; i < repeat; i++) {
                Thread.sleep(1000);
                System.out.println(text);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
