package main.java.com.str.chptr21;
import java.io.*;
import java.nio.file.attribute.*;
import java.nio.file.*;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("examples\\test.txt");

        System.out.println("Имя файла: " + filepath.getName(1));
        System.out.println("Путь к файлу" + filepath);
        System.out.println("Абсолютный путь" + filepath.toAbsolutePath());
        System.out.println("Родительский каталог " + filepath.getParent());
        if (Files.exists(filepath))
            System.out.println("Файл существует");
        else
            System.out.println("Файл не существует");

        try {
            if (Files.isHidden(filepath))
                System.out.println("Файл скрыт");
            else
                System.out.println("Файл не скрыт");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        }
        Files.isWritable(filepath);
        System.out.println("Файл доступен для записи");

        Files.isReadable(filepath);
        System.out.println("Файл достпен для чтения");

        try {
            BasicFileAttributes attribs = Files.readAttributes(filepath, BasicFileAttributes.class);

            if (attribs.isDirectory())
                System.out.println("Это каталог");
            else
                System.out.println("Это не каталог");
            if (attribs.isRegularFile())
                System.out.println("Это обычный файл");
            else
                System.out.println("Это не обычный файл");
            if (attribs.isSymbolicLink())
                System.out.println("Это сивольная ссылка");
            else
                System.out.println("Это не символьная ссылка");
            System.out.println("Время последней модификации " + attribs.lastModifiedTime());
            System.out.println("Размер файла: " + attribs.size() + " байт");
        } catch (IOException e) {
            System.out.println("Ошибка чтения атрибутов: " + e);
        }
    }
}
