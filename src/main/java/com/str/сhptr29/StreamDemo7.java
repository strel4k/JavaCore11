package main.java.com.str.сhptr29;
import java.util.*;
import java.util.stream.*;

class NamePhoneEmail1 {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail1(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone1 {
    String name;
    String phonenum;

    NamePhone1(String n, String p) {
        name = n;
        phonenum = p;

    }
}

public class StreamDemo7 {
    public static void main(String[] args) {
        //список имен номеров телефоно и имейлов
        ArrayList<NamePhoneEmail1> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail1("Larry", "555-5555", "Larry@HerbShildt.com"));
        myList.add(new NamePhoneEmail1("James", "555-4444", "James@HerbShildt.com"));
        myList.add(new NamePhoneEmail1("Mary", "555-3333", "Mary@HerbShildt.com"));

        //отобразить только имена и номера телефонов на новый поток данных
        Stream<NamePhone1> nameAndPhone1 = myList.stream().map((a)-> new NamePhone1(a.name, a.phonenum));

        //вызвать метод collect() чтобы составить список типа list из имен и номеров телефонов
        List<NamePhone1> npList = nameAndPhone1.collect(Collectors.toList());
        System.out.println("Имена и номера телефонов в списке типа List:");
        for (NamePhone1 e: npList)
            System.out.println(e.name + ": " + e.phonenum);
        //получить другое отображение имен и номеров телефонов
        nameAndPhone1 = myList.stream().map((a)-> new NamePhone1(a.name, a.phonenum));
        //а теперь создать множетсво типа Set, высзвав метод collect()
        Set<NamePhone1> npSet = nameAndPhone1.collect(Collectors.toSet());
        System.out.println("\nИмена и номера теоефонов в множестве типа Set:");
        for (NamePhone1 e:npSet)
            System.out.println(e.name + ": " + e.phonenum);
    }
}
