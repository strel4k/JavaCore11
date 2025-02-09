//Использование лямбда-выражение для создания компаратора с обратным упорядочиванием
import java.util.*;

class CompDemo2 {
    public static void main(String[] args) {

        //передать компаратор с обратным упорядочиванием древовидному множеству типа TreeSet
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));

        //ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        // вывести элементы древовидного множества
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}