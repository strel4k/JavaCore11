// Использовать список свойств по умолчанию
import java.util.*;
class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Флорида", "Тэлесси");
        defList.put("Висконсин", "Мэдисон");
        Properties capitals = new Properties(defList);
        capitals.put("Иллинойс","Спрингфилд");
        capitals.put("Вашингтон","Олимпия");
        capitals.put("Индиана","Индианаполис");

        //получить множество ключей
        Set<?> states = capitals.keySet();

        //вывести все штаты и их столицы
        for (Object name : states)
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String)name) + ".");
        System.out.println();

        //Теперь штат флорида будет найден в спискее по умолчанию
        String str = capitals.getProperty("Флорида");
        System.out.println("Столица Флориды - " + str + ".");
    }
}
