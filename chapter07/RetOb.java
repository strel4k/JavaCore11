// Возврат объекта
class Test {
    int a;

    Test(int i) {
        a = i;          //Поле a — это атрибут объекта класса Test, который хранит целочисленное значение.
    }

    Test incrByTen() {
        Test temp = new Test(a+10);         //Создать новый объект Test с увеличенным значением a
        return temp;                           //Вернуть созданный объект
    }
}

class RetOb {
    public static void main(String args[]) {
        Test ob1 = new Test(2);             // Создать объект ob1 с a=2
        Test ob2;

        ob2 = ob1.incrByTen();                  // ob2 получает объект с a=ob1.a+10 (то есть 12)
        System.out.println("ob1.a: " + ob1.a);  // Вывод: ob1.a = 2
        System.out.println("ob2.a: " + ob2.a);  // Вывод: ob2.a = 12

        ob2 = ob2.incrByTen();                  // ob2 получает новый объект с a=ob2.a+10 (то есть 22)
        System.out.println("ob2.a после второго увелечения значения: " + ob2.a);
    }
}