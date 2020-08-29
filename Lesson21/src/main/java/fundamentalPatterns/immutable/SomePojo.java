package fundamentalPatterns.immutable;

public class SomePojo {

    private String strValue;
    private int intValue;

    public SomePojo(String strValue, int intValue) {
        this.strValue = strValue;
        this.intValue = intValue;
    }

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public String toString() {
        return "fundamentalPatterns.immutable.SomePojo{" +
                "strValue='" + strValue + '\'' +
                ", intValue=" + intValue +
                '}';
    }
}
