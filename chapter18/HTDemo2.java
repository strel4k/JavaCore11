// Применить итераторы вместе с классом hashtable
import java.util.*;

class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String, Double>();

        String str;
        double bal;

        balance.put("Джон Доу", 3434.34);
        balance.put("Том Смит", 123.22);
        balance.put("Джейн Бейкер", 1398.00);
        balance.put("Тод Холл", 99.22);
        balance.put("Ральф Смит", -19.08);

        //вывести все счета в хэщ таблице Сначала получить представление всех ключей в виде множества
        Set<String> set = balance.keySet();

        //получиться итератор
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        //внести сумму 1000 на счет джона доу
        bal = balance.get("Джон Доу");
        balance.put("Джон Доу", bal+1000);
        System.out.println("Новый остаток на счете Джона Доу: " + balance.get("Джон Доу"));
    }
}