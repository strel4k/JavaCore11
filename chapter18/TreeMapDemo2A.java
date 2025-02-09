//Использовать метод theComparing() лоя сортировки счетов вкладчиков сначала по фамилии затем по имени
import java.util.*;

//Компаратор, сравнивающий фамилии вкладчиков
class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
//отсортировать счета вкладчков по фио елси фамилии одинаковые
class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A {
    public static void main(String[] args) {
        // использовать метод thenCoшparing () для создания компаратора , сравнивающего сначала фамилии , а затем Ф.И.О. вкладчиков , если фамилии одинаковы
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());
        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);
        //ввести элементы в древовиднеое отображение
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести элементы из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести 1000 на счет Джона доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на  счете Джона Доу: " + tm.get("Джон Доу"));
    }
}