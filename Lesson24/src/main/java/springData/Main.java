package springData;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("app-context.xml");
       /* Some some = new SomeImpl();
        some.doSome();*/

        context.getBean(Some.class).doSome();
    }

}
