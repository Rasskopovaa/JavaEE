public class Someclass {


    int myInt = 12;
    String myString = "String value";

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public void chechString() {
        String myString2 = myString;
        System.out.println(myString == myString2);//проверяем ссылки true
        myString = "newValue";
        System.out.println(myString == myString2);//false
        String myString3 = "Sring value";
        System.out.println(myString2 == myString3);//true. так как уже есть такая переменная в пуллестрингов ,то создается лишь ссылка, а если создать с помощью new String() то будеет false
    }

    public void checkInteger() {
        Integer a = 182;
        Integer b = 182;
        System.out.println(a == b);
//выведет false потому-что integer берет значения от -128...127
    }

    public void operatorsTest() {
        long mylong = 12;
        int myInt = (int) mylong;

    }
}