package main.java.com.str.chptr20;
//продемонстрировать организацию последовательного ввода
//в этой программе используется try с ресурсами
import java.io.*;
import java.util.*;

class InputStreamEnumeration implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumeration(Vector<String> files) {
        this.files = files.elements();
    }

    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException e) {
            return null;
        }
    }
}

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();

        files.addElement("file2.txt");
        files.addElement("file3.txt");
        files.addElement("file1.txt");
        InputStreamEnumeration ise = new InputStreamEnumeration(files);
        InputStream input = new SequenceInputStream(ise);

        try {
            while((c = input.read()) != -1)
                System.out.print((char) c);
        } catch (NullPointerException e) {
            System.out.println("Ошибка открытия файла");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия потока ввода SequenceInputStream");
            }
        }
    }
}
