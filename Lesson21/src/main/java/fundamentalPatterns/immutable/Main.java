package fundamentalPatterns.immutable;

public class Main {
    public static void main(String[] args) {
        SomePojo somePojo = new SomePojo("anotherString", 13);
        SomeClass someClass = new SomeClass("sting", 12, somePojo);
        System.out.println(someClass);
        SomePojo newPojo = someClass.getSomePojo();
        newPojo.setIntValue(6);
        newPojo.setStrValue("Changed value");
        System.out.println(someClass);
    }
}
