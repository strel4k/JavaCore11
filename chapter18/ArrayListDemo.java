import java.util.*;
// Демонстрация применение класса ArrayList
class ArrayListDemo {
    public static void main(String[] args) {
        //создать списочный массив
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Начальный размер списочного массива al: " + al.size());

        //ввод элементов в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");

        System.out.println("Размер списочного массива al после ввода элементов: " + al.size());
        //вывод списочного массива
        System.out.println("Содержимое списочного массива al: " + al);

        //удаление элементов из списочного массива
        al.remove("F");
        al.remove(2);
        System.out.println("Размер списочного массива al после удаления элементов: " + al.size());
        System.out.println("Содержимое списочного массива al после удаления элементов: " + al);

    }
}