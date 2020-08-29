package fundamentalPatterns.immutable;

public class SomeClass {
    SomePojo somePojo;
    private String strField;
    private int IntField;

    public SomeClass(String strField, int intField, SomePojo somePojo) {
        this.strField = strField;
        IntField = intField;
        SomePojo newPojo = new SomePojo(somePojo.getStrValue(), somePojo.getIntValue());
        this.somePojo = somePojo;
    }

    public String getStrField() {
        return strField;
    }

    public void setStrField(String strField) {
        this.strField = strField;
    }

    public int getIntField() {
        return IntField;
    }

    public void setIntField(int intField) {
        IntField = intField;
    }

    public SomePojo getSomePojo() {
        return new SomePojo(somePojo.getStrValue(), somePojo.getIntValue());
    }

    public void setSomePojo(SomePojo somePojo) {
        this.somePojo = somePojo;
    }

    @Override
    public String toString() {
        return "fundamentalPatterns.immutable.SomeClass{" +
                "strField='" + strField + '\'' +
                ", IntField=" + IntField +
                ", somePojo=" + somePojo +
                '}';
    }
}
