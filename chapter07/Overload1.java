//Применить автоматическое преобразование типов к перегрузке
class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствауют");
    }
    //Перегружаемый ме тод , проверяющий наличие наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " и " + b);
    }

    //Перегружаемый метод проверяющий наличие параметра типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове test(double) а: " + a);
    }
}

class Overload1 {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10,20);
        ob.test(i);            // здесь вызывается вариант метода test(double) int преобразован в double
        ob.test(123.2);     //а здесь вызывается вариант метода test (double)
    }
}