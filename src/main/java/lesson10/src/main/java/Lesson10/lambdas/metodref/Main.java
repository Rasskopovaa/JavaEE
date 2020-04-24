package Lesson10.lambdas.metodref;

public class Main {
    public static void main(String[] args) {
      /*  iGreeter sayHi = Greeter::sayHi;
        sayHi.sayHi();*/

    /*Greeter hello= new Greeter();
    iGreeter sayHi2 = hello::sayHiBrighly;
    sayHi2.sayHi();*/

    iGreeter hello3 =()-> System.out.println("Salem");
    hello3.sayHi();
}
}