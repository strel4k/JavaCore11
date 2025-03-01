package main.java.com.str.chptr20;
// продемонстрировать применение класса FileInputStream
// В этой программе используется оператор try с ресурсами.
// Требуется установка комплекта JDK, начиная с версии 7
import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        //для автоматического закрытия потока ввода используется try с ресурсами
        try (FileInputStream f = new FileInputStream("FileInputStreamDemo.java")) {
            System.out.println("Общее количество доступных байтов: " + (size = f.available()));
            int n = size/40;
            System.out.println("Первые " + n + "байт, " + "прочитанных их файла по очереди метожом read()");
            for (int i=0; i<n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("\nВсе еще доступно: " + f.available());
            System.out.println("Чтение следующих " + n + " байт по очереди методом read(b[])");
            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.out.println("нельзя прочитать " + n + " байт.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nВсе еще доступно: " + (size = f.available()));
            System.out.println("Пропустить половину оставихся байт методом skip()");
            f.skip(size/2);
            System.out.println("все еще доступно " + f.available());
            System.out.println("Чтение " + n/2 + " байт, размещенных в конце массива");
            if (f.read(b, n/2, n/2) != n/2) {
                System.err.println("нельзя прочитать " + n/2 + "байт");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсе еще доступно: " + f.available());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
