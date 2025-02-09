// Продемонстрировать применение списка свойств
import java.util.*;

class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллинойс","Спрингфилд");
        capitals.put("Вашингтон","Олимпия");
        capitals.put("Индиана","Индианаполис");

        //получить мнодество ключей
        Set<?> states = capitals.keySet();

        //показать все штаты и их столицы
        for(Object name : states)
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String)name) + ".");
        System.out.println();

        //найти штат, отсутствующий в списке, указав значения, выбираемые по умолчанию
        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица штата Флорида " + str + ".");
    }
}