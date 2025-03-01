package main.java.com.str.chptr21;
import java.io.*;
import java.nio.file.*;

public class NIOStreamWrite {
    public static void main(String[] args) {
        //открыть файл и получить связнный с ним поток вывода
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))){
            //вывести в поток заданной количество байт
            for (int i = 0; i < 26; i++)
                fout.write((byte)('A' + i));
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода " + e);
        }
    }
}
