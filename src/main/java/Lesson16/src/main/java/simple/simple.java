package simple;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class simple {
    public static void main(String[] args) {
        System.err.println("Message to console");
        System.err.println("Usual message");
        try {
            System.setErr(new PrintStream(new FileOutputStream("errLog2.log")));
            System.err.println("Message to file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
