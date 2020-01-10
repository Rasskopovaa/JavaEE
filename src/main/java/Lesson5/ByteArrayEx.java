package Lesson5;

import java.io.ByteArrayInputStream;

public class ByteArrayEx {
    public static void main(String[] args) {
        byte[] array = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream = new ByteArrayInputStream(array);
        int n;
        while ((n = byteStream.read()) != -1) {
            System.out.println(n);
        }
   String text = "My string";
        byte[] array2= text.getBytes();
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2,3,6);

        int m;
        while((m=byteStream2.read())!=-1){
            System.out.println((char)m);
        }
    }
}
