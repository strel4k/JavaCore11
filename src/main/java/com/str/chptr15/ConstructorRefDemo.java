package main.java.com.str.chptr15;
//продемонстрировать применение ссылки на конструктор

//в функциональном интерфейсе MyFunc определяется метод, возвращающий ссылку на класс MyClass
interface MyFunc5 {
    MyClass func(int n);
}

class MyClass6 {
    private int val;

    //этот конструктор принимает один аргумент
    MyClass6(int v) { val = v; }

    //коструктор по умолчанию
    MyClass6() { val = 0; }

    //...

    int getVal() { return val; };
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор класса МyClass .
        // Метод func () из интерфейса МyFunc принимает аргумент,
        // поэтому оператор new обращается к параметризированному
        // конструктору класса МyClass, а не к его конструктору по умолчанию
        MyFunc5 myClassCons = MyClass::new;

        // создать экземпляр класса MyClass по ссылке на его конструктор
        MyClass mc = myClassCons.func(100);

        //использовать только что созданный экземпляр класса MyClass
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
