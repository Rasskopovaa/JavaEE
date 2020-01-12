package Lesson5;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffOStream {
    public static void main(String[] args) {
        String a = "My string variable value";
        try(FileOutputStream out = new FileOutputStream("notes.txt");
        BufferedOutputStream bos = new BufferedOutputStream(out)){
            byte[] builder = a.getBytes();
            bos.write(builder);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
