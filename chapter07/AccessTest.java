//В этой программе демонстрируется отличие модификаторов public и privete
class Test {
    int a; //доступ по умолчанию
    public int b; //открытый доступ
    private int c; //закрытый доступ

    //метод доступа к члену с данного класса
    void setc(int i) { //установить значение члена с данного класса
        c = i;
    }
    int getc() {    //получение значения члена с данного класса
        return c;
    }
}

class AccessTest {
    public static void main(String args[]) {
        Test ob = new Test();

        //Эти операторы праввильны, поэтому а и b данного класса достуепны непосредственно
        ob.a = 10;
        ob.b = 20;

        //этот оператор неверен и может вызватиь ошибку
        //ob.c = 100; //error

        //Доступ к члену с данного класса должен осуществляться с помощью методов ее класса
        ob.setc(100); //верно
        System.out.println("a, b, c : " + ob.a + " " + ob.b + " " + ob.getc());
    }
}