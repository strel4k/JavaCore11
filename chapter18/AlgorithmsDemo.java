//Продемонстрировать применение разлдичных алгосов коллекций
import java.util.*;

class AlgorithmsDemo {
    public static void main(String[] args) {
        //создать неиницилизированный связный список
        LinkedList<Integer> ll = new  LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        //создать компаратор с обратным упорядочиванием
        Comparator<Integer> r = Collections.reverseOrder();

        //отсортировать список с помощью этого компаратора
        Collections.sort(ll, r);

        System.out.print("Список отсортирован в побратном порядке: ");

        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();

        //перетасовать список
        Collections.shuffle(ll);

        //вывести перетасованный список
        System.out.print("Список перетасован: ");
        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();
        System.out.println("Mинимyм: " + Collections.min(ll));
        System.out.println("Максимум: " + Collections.max(ll));

    }
}