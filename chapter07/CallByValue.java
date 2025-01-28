// Аргументы примитивных типов передаются по значению
class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main(String args[]) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("а и b до вызова: " + a + " " + b);

        ob.meth(a, b);                      //Когда вызывается meth(a, b), в метод передаются копии значений a и b.
                                            //Внутри метода изменяются только эти копии (i и j), а оригинальные переменные a и b остаются нетронутыми.
        System.out.println("а и b после вызова: " + a + " " + b);
    }
}