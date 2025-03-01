package main.java.com.str.сhptr29;
import java.util.*;
import java.util.stream.*;

public class StreamDemo10 {
    public static void main(String[] args) {
        //создать список символьых строк
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        //получить поток данных для списочного массива
        Stream<String> myStream = myList.stream();
        //получить итератор-разделитель
        Spliterator<String> splitItr = myStream.spliterator();
        //разделить первый итератор
        Spliterator<String> splitItr2 = splitItr.trySplit();

        //использовть сначала итератор splitItr2 если нельщя разделить splitItr
        if (splitItr2 != null) {
            System.out.println("результат выводимый итератором splitItr2: ");
            splitItr2.forEachRemaining((n)-> System.out.println(n));
        }
        //а теперь воспользоваться итератором splitItr
        System.out.println("\nРезультат выводимый итератором splitItr: ");
        splitItr.forEachRemaining((n)-> System.out.println(n));
    }
}
