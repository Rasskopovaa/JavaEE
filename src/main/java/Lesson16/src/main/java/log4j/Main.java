package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    final static Logger LOGGER= Logger.getLogger(Main.class);
    public static void main(String[] args) {

        LOGGER.debug("debug-message");
        LOGGER.info("info-message");
        LOGGER.warn("warn-message");
        LOGGER.error("error-message");
        LOGGER.fatal("fatal-message");

        try{
            throw new Exception("test exception");
        } catch (Exception e) {
            LOGGER.error(e.getMessage());

        }
        SomeClass someClass = new SomeClass();

    }
}
