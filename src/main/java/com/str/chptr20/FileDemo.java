package main.java.com.str.chptr20;
// Продемонстрировать применение некоторых методов из класса File
import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("/java/COPYRIGHT");
        p("Имя файла: " + f1.getName());
        p("Путь " + f1.getPath());
        p("Абсолютный путь " + f1.getAbsolutePath());
        p(f1.exists() ? "существует" : "не существует");
        p(f1.canWrite() ? "ддоступен для записи" : "недоступен для записи");
        p(f1.canRead() ? "доступен для чтения" : "недоступен для чтения");
        p(f1.isDirectory() ? "является каталогом" : "не является каталогом");
        p(f1.isFile() ? "является файлом " : "не является файлом");
        p(f1.isAbsolute() ? "является абсолютным" : "не является абсолютным");
        p("Последнее изменение в файле: " + f1.lastModified());
        p("размер " +f1.length() + "байт");
    }
}
