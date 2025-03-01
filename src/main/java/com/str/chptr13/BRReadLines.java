package main.java.com.str.chptr13;
import java.io.*;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        //создать потом ввода типа BufferdReader используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'Стоп' для завершения.");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("Стоп"));
    }
}
