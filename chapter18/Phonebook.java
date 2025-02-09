//ПРостая база телефонных номеров построенная на сонове списков свойств
import java.io.*;
import java.util.*;

class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        //попытаться открыть файл phonebook.dat
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            //игнорроват ьотсутсвующий файл
        }
        // если телефонна я книга уже существует загроузить существуебющие номера
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Ощибка чтения файла");
        }
        //разрещиьб пользователю вводитььб новые имена и номера телеонов абонентов
        do {
            System.out.println("Введите имя" + "('выход' для завершения): ");
            name = br.readLine();
            if (name.equals("выход")) continue;
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("Выход"));
        //сохранить телефонную книгу если она изменилдась
        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонная книга");
            fout.close();
        }
        //искать номер по имени абонента
        do {
            System.out.println("Введите имя для поиска" + " ('выход' для завершения): ");
            name = br.readLine();
            if(name.equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("выход"));
    }
}