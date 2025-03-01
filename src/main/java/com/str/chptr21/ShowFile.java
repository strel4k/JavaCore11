package main.java.com.str.chptr21;
import java.io.*;
import java.nio.file.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        //сначала удостовериться что указано имя файла
        if (args.length != 1) {
            System.out.println("Примениние: ShowFile имя_файла");
            return;
        }
        //открыть файл и получить связаный с ним поток ввода вывода
        try (InputStream fin = Files.newInputStream(Paths.get(args[0]))){
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);

        }catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
