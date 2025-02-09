import java.util.*;

class TreeMapDemo {
    public static void main(String[] args) {
        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        //ввести элементы в древовидное отображение


        // получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000 на счет джона доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Дону", balance + 1000);
        System.out.println("Новый остаток на  счете Джона Доу: " + tm.get("Джон Доу"));
    }
}