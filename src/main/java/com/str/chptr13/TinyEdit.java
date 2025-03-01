package main.java.com.str.chptr13;
import java.io.*;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        //создать поток ввода типа BufferedReader Используя станданртный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[100];
        System.out.println("Введите строки текста");
        System.out.println("Введите 'Стоп' ждя завершения");

        for (int i=0; i<100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("Стоп")) break;
            System.out.println(str[i]);
        }
    }
}
