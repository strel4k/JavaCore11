//различные операции с векторами
import java.util.*;

class VectorDemo {
    public static void main(String[] args) {

        // начальный размер вектора - 3, а инкремент - 2
        Vector<Integer> v = new Vector<Integer>(3, 2);
        System.out.println("Начальный размер вектора: " + v.size());
        System.out.println("Начальная емость веткора: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Емкость вектора после ввода четырех элементов: " + v.capacity());

        v.addElement(5);
        System.out.println("Текущая емкость вектора: " + v.capacity());
        v.addElement(6);
        v.addElement(7);

        System.out.println("Текущая емкость вектора: " + v.capacity());
        v.addElement(9);
        v.addElement(10);

        System.out.println("Текущая емкость вектора: " + v.capacity());
        v.addElement(9);
        v.addElement(10);

        System.out.println("Первый элемент вектора: " + v.firstElement());
        System.out.println("Последний элемент вектора: " + v.lastElement());
        if (v.contains(3))
            System.out.println("Вектор содержит 3.");

        //перечислить элементы вектора
        Enumeration<Integer> vEnum = v.elements();

        System.out.println("\nЭлементы вектора:");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}