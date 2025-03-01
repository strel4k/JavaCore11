package main.java.com.str.сhptr29;
import java.util.*;
import java.util.stream.*;

public class StreamDemo9 {
    public static void main(String[] args) {
        //создать список символьных строк
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        //получить поток данных для списочного массива
        Stream<String> myStream = myList.stream();
        //получить итератор разделитель
        Spliterator<String> splitItr = myStream.spliterator();
        //Перебрать элементы в потоке данных
        while (splitItr.tryAdvance((n)-> System.out.println(n)));
    }
}
