package fundamentalPatterns.markerInterface;

public class MyClass {
    private Integer var1;
    private Integer ver2;

    public MyClass(Integer var1, Integer ver2) {
        this.var1 = var1;
        this.ver2 = ver2;
    }

    public Integer getVar1() {
        return var1;
    }

    public void setVar1(Integer var1) {
        this.var1 = var1;
    }

    public Integer getVer2() {
        return ver2;
    }

    public void setVer2(Integer ver2) {
        this.ver2 = ver2;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "var1=" + var1 +
                ", ver2=" + ver2 +
                '}';
    }


    protected MyClass clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return new MyClass(var1, ver2);
    }
}
