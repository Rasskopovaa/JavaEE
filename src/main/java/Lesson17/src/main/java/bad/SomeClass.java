package bad;

public class SomeClass {
    public Integer methodWithHelper( Integer a, Integer b) {
        Helper helper = new Helper();
        int res = helper.SomeHelperMethod(a + 10, b + 15);
        return res;

    }
}
