package main.java.com.str.сhptr29;
import java.util.*;
import java.util.stream.*;

public class StreamDemo6 {
    public static void main(String[] args) {
        //Список значений типа double
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);

        System.out.println("Исходные значения из списка myList: ");
        myList.stream().forEach((a)-> {
            System.out.print(a + " ");
        });
        System.out.println();

        //отобразить максимально допустимый предел каждого значения из списка myList
        //на поток данных типа IntStream
        IntStream cStrm = myList.stream().mapToInt((a)-> (int) Math.ceil(a));

        System.out.print("Максимально допустимые пределы значений" + "из списка myList: ");
        cStrm.forEach((a) -> System.out.print(a + " "));
    }
}
