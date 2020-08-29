package fundamentalPatterns.interfaces;

public class SomeClass implements FirstInterface, SecondInterface {
    @Override
    public void someMethod1() {
        System.out.println("method1");

    }

    @Override
    public void someMethod2() {
        System.out.println("method2");

    }
}
