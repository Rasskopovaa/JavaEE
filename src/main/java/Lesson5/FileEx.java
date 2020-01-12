package Lesson5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C://SomeDr//notes.txt");
             FileOutputStream fos = new FileOutputStream("C://SomeDr// new notes.txt")) {
        byte [] buffer = new byte [fis.available()];
        fis.read(buffer,0,buffer.length);
        fos.write(buffer,0,buffer.length);

        }
    catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }