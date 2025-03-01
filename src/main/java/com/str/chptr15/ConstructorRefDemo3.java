package main.java.com.str.chptr15;
//реализовать простую фабрику классов используя ссылку на конструктор
interface MyFunc32<R, T> {
    R func(T n);
}

//Простой обобщенный класс
class MyClass11<T> {
    private T val;
    //КОнструктор, принимающий 1 параметр
    MyClass11(T v) { val = v; }

    //Конструктор по умолчанию. Этот конструктор в данной программе не используется
    MyClass11() { val = null; }
    //...

    T getVal() { return val; };
}

//простой необобщенный класс
class MyClass23 {
    String str;

    //Конструктор, принимающий один аргумент
    MyClass23(String s) { str = s; }

    //Конструктор по умолчанию. Этот конструктор в пданныой программе не используется
    MyClass23() { str = ""; }

    //..

    String getVal() { return str; };
}

public class ConstructorRefDemo3 {
    // Фабричный метод для объектов разных классов.
    // У каждого класса должен быть свой конструктор,
    // принимающий один параметр типа Т. А параметр R
    // обозначает тип создаваемого объекта

    static <R,T> R myClassFactory(MyFunc32<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор класса
        // В данном случае оператор new обращается к конструктору,
        // принимающему аргумент
        MyFunc32<MyClass11<Double>, Double> myClassCons = MyClass11<Double>::new;

        //создать экземпляр типа класса MyClass, используя фабричный метод
        MyClass11<Double> mc = myClassFactory(myClassCons, 100.1);

        //использовать только что созданный кэкземпляр класса MyClass
        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        //А теперь создать экземпляр другого класса исопльзуя метод myClassFactory()
        MyFunc32<MyClass23, String> myClassCons2 = MyClass23::new;

        //создать экземпляр класса MyClass23 используя фабричный метод
        MyClass23 mc23 = myClassFactory(myClassCons2, "Лямбда");

        //использовать только что созданный экземпляр класса MyClass
        System.out.println("Значение str в объекте mc23 равно " + mc23.getVal());
    }
}
