package main.java.com.str.chptr13;
import java.io.*;

/* Версия программы CopyFile, использующая оператор try сресурсами.
Она демонстрирует управление двумя ресурсами (в данном случае - файлами ) в одном операторе try
*/

public class CopyFile2 {
    public static void main(String[] args) throws IOException {

        int i;
        //сначала убедиться что имя файла указано
        if (args.length != 2) {
            System.out.println("Использование: CopyFile2 откуда-куда");
            return;
        }
        //открыть два файла и управлять ними в поераторе try
        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        }
    }
}
