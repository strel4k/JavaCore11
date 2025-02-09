//Демонстрация применение класса HashSet
import java.util.*;

class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        //ввод элементов в хеш-множество
        hs.add("Бета");
        hs.add("Aльфa");
        hs.add("Этa");
        hs.add("Гaммa");
        hs.add("Эпсилон");
        hs.add("OМeгa");

        System.out.println(hs);
    }
}