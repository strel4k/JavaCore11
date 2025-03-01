package main.java.com.str.chptr13;
import java.io.*;

/* Копирование файла .
Чтобы воспользоваться этой программой, укажите
имена исходного и целевого файлов .
Например, чтобы скопировать файл FIRST.TXT в файл SECOND.ТXT, введите в командной строке следующую команду :
java CopyFile FIRST.ТXТ SECOND.ТXТ
*/

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // сначала убедиться что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("Использование: CopyFile  откуда куда");
            return;
        }
        //копировать файл
        try {
            //попытаться открыть файл
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла ввода");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}
