package main.java.com.str.chptr13;

//продемонстрировать применение оператора assert
public class AssertDemo {
    static int val = 3;
    //возвратить целочисленное значение
    static int getnum() {
        return val--;
    }
    public static void main(String[] args) {
        int n = 0;

        for (int i=0; i<10; i++) {
            n = getnum();
            assert n > 0; //не подтвердится если n == 0
            System.out.println("n равно" + n);
        }
    }
}
