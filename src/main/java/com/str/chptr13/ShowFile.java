package main.java.com.str.chptr13;
import java.io.*;
/*
Отображение содержимого текстового файла. Чтобы воспользоваться этой программой, укажите имя файла, который требуется просмотреть.
 Например, чтобы просмотреть файл TEST.TXT, введите в командной строке следующую команду:
java ShowFile ТЕSТ.ТХТ
*/
public class ShowFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;

        //сначала убедить что имя файла указано
        if(args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != 1);
        } catch (FileNotFoundException e) {
            System.out.println("ошибка ввода-вывода" + e);
        } finally {
            //закрыть файл в любом случае
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
