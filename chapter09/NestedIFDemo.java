//Пример вложенного интерфейса

//Этот класс содержит интерфейс как свой член
class A {
    // это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

//класс В реализует вложенный интерфейс
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {       //A.NestedIF и предоставляет конкретную реализацию метода isNotNegative().
        return x < 0? false : true;
    }
}

class NestedIFDemo {
    public static void main(String args[]) {

        //использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();       //создается объект nif типа A.NestedIF, который на самом деле является объектом класса B.

        if (nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это выведено не будет");
    }
}