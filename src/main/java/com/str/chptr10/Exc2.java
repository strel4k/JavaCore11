package main.java.com.str.chptr10;

class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {   //проконтролировать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это выведено не будет");
        } catch (ArithmeticException e) {   // перехват ошибки деления на 0
            System.out.println("Деление на 0");
        }
        System.out.println("После оператора catch");
    }
}
