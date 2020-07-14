package second;

public class HelperImpl implements Helper{

    @Override
    public Integer SomeHelperMethod(Integer a, Integer b) {
        return (a+b)*2;
    }

    @Override
    public void AnotherHelperMethod(Integer a, Integer b) {
        System.out.println((a+b)*2);
    }
}
