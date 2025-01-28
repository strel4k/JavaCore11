// Демонстрация порядка вызова конструкторов
// создать суперкласс

class A {
    A() {
        System.out.println("В констукторе А.");
    }
}

// создать подкласс путем расширения класса А
class B extends A {
    B() {                           //В начале каждого конструктора в подклассе неявно вызывается конструктор суперкласса с помощью ключевого слова super()
        System.out.println("B конструктое В.");
    }
}

class C extends B {
    C() {
        System.out.println("B конструктое C.");
    }
}

class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
}
/*
Порядок вызова конструктора определяется иерархией наследования.
Сначала создаётся базовая часть объекта (суперклассы), а затем расширения, добавляемые подклассами.
 */