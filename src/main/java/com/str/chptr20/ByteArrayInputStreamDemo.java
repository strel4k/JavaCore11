package main.java.com.str.chptr20;
import java.io.*;
// Продемонстрировать применение класса ВyteArrayinputStream
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String tmp = "qwerty";
        byte b[] = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);


    }
}
