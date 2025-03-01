package main.java.com.str.chptr15;
//Продемонстрировать применение ссылки на конструктор обобзенного класса

//Теперь фунциональный интерфейс MyFunc обобщенный
interface MyFunc0<T> {
    MyClass0<T> func(T n);
}

class MyClass0<T> {
    private T val;

    //этот конструктор принимает один аргумент
    MyClass0(T v) { val = v; }

    //это конструкто по умолчанию
    MyClass0() { val = null; }

    //...

    T getVal() { return  val; };
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        //создать ссылку на конструктор обобщенного класса MyClass<T>
        MyFunc0<Integer> myClassCons = MyClass0<Integer>::new;

        //создать экземпляр класса MyClass<T> по данной ссылке на конструктор
        MyClass0<Integer> mc = myClassCons.func(100);

        //воспользоваться только что созданным экземпляром класса MyClass<T>
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
