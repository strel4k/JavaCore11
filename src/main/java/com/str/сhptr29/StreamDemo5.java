package main.java.com.str.сhptr29;
import java.util.*;
import java.util.stream.*;

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone {
    String name;
    String phonenum;

    NamePhone(String n, String p) {
        name = n;
        phonenum = p;

    }
}

public class StreamDemo5 {
    public static void main(String[] args) {
        //список имен номеров телефоно и имейлов
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbShildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbShildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@HerbShildt.com"));

        System.out.println("Исходные элементы из списка myList: ");
        myList.stream().forEach((a)->{
            System.out.println(a.name + a.phonenum + a.email);
        });
        System.out.println();
        //отобразить на новый поток данных njkmrj bvtyf b yjvthf ntktajyjd
        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));
        System.out.println("Список имен и номеров телефонов: ");
        nameAndPhone.forEach((a)-> System.out.println(a.name + " " + a.phonenum));
    }
}
