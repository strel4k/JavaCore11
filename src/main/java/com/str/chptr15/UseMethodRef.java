package main.java.com.str.chptr15;
        // Использовать ссылку на метод, чтобы найти
        // максимальное значение в коллекции
import java.util.*;
class MyClass {
    private int val;
        MyClass(int v) { val = v; }
        int getVal() { return val; }
    }

public class UseMethodRef {
    // Метод compare() совместимый с аналоничным методом определенным в интерфейсе Comparator
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }
    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<MyClass>();
        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));

        //найти максимальное значение, успользуя метод compareMC()
        MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);
        System.out.println("Максимальное значение равно: " + maxValObj.getVal());
    }
}
