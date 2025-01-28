// Простой пример наследования

// создать суперкласс

class A {
    int i, j;       //поля i и j

    void showj() {
        System.out.println("i и j: " + i + " " + j);        // Метод showj(), который выводит значения i и j
    }
}

// создать подкласс путем расширения класса А
class B extends A {
    int k;          // Новое поле k

    void showk() {          // Метод showk(), который выводит значение k
        System.out.println("k: " + k);
    }
    void sum() {            // Метод sum() который выводит сумму всех полей
        System.out.println("i + j + k: " + (i+j+k));
    }
}

class SimpleInheritance {
    public static void main(String args[]) {
        A superOb = new A();        // Создание объекта суперкласса
        B subOb = new B();          // Создание объекта подкласса

        // суперкласс может использоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showj();
        System.out.println();

        //подкласс имеет доступ ко всем открытым членам своего суперкласса.
        subOb.i = 7;            // Поле унаследовано от A
        subOb.j = 8;            // Поле унаследовано от A
        subOb.k = 9;            // Поле, добавленное в B
        System.out.println("Содержимое объекта subOb: ");
        subOb.showj();          // Метод унаследован от A
        subOb.showk();          // Метод определен в B

        System.out.println();
        System.out.println("Сумма i, j и k в объекте subOb:");
        subOb.sum();            // Метод определен в B



    }
}