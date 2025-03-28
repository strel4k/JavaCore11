// динамическая диспетчерезация методов
class A {
    void callme() {
        System.out.println("В методе callme() из класса A");
    }
}

class B extends A {
    //переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса B");
    }
}

class C extends A {
    //переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса С");
    }
}

class Dispatch {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;        // получить ссылку на объект. Переменная r имеет тип A (базовый класс), но она может ссылаться на объекты любого из классов A, B, или C.

        r = c;      // переменная r ссылается на объект типа А
        r.callme(); // вызвать вариант метода callme
                    // определенный в классе А

        r = b;      //переменная r ссылается на объект типа B
        r.callme(); //вызвать вариант метода callme
                    // определенный в классе B

        r = a;      //переменная r ссылается на объект типа C
        r.callme(); //вызвать вариант метода callme
                    //определенный в классе C

    }
}

/*
Когда метод вызывается через ссылку на базовый класс, JVM во время выполнения определяет,
к какому классу принадлежит фактический объект, на который указывает ссылка.
На основе этого вызывается соответствующий метод.

Это позволяет использовать полиморфизм, где базовый класс предоставляет общий интерфейс, а подклассы реализуют свою специфическую функциональность.
 */