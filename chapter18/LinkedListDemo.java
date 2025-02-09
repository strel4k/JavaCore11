import java.util.*;

class LinkedListDemo {
    public static void main(String[] args) {
        //создать связанный список
        LinkedList<String> ll = new LinkedList<String>();

        //ввести элементы в связанный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");

        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1, "A2");

        System.out.println("Исходное содержимое связанного списка ll: " + ll);
        //удаление элементов из связанного списка
        ll.remove("F");
        ll.remove(2);
        System.out.println("Cодержимое связанного списка ll: " + "после удаления элементов: " + ll);
        //удаление первого и последнего элемента
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Cодержимое связанного списка ll: " + "после удаления первого и последнего элементов: " + ll);
        //получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("Cодержимое связанного списка ll после изменения: " + ll);


    }
}