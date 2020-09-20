package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        DataHandler dataHandler = (DataHandler) context.getBean(DataHandler.class);
        DataHandler dataHandler2 = (DataHandler) new ClassPathXmlApplicationContext("appContext.xml").getBean(DataHandler.class);
    }
}
