package Log4j;


import org.apache.log4j.Logger;

public class SomeClass {
    final static Logger LOGGER = Logger.getLogger(SomeClass.class);
    public SomeClass(){
LOGGER.warn("Warn from SomeClass");
LOGGER.info("INFO from SomeClass");
    }
}
