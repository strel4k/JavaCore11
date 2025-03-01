package main.java.com.str.chptr15;
//продемонстрировать применение лямбда выражения
//принимающего один параметр

//Еще один функциональный интерфейс
interface NumericTest {
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        //лямбда выражение проверяющее является ли число четным
        NumericTest isEven = (n) -> (n % 2)==0;

        if (isEven.test(10)) System.out.println("число 10 четное");
        if (!isEven.test(9)) System.out.println("Число 9 не четное");

        //а теперь воспользоваться ляибда-выражением в котором проверяется
        //является ли чилсо неотрицательным
        NumericTest isNotNeg = (n) -> n >= 0;

        if(isNotNeg.test(1)) System.out.println("число 1 положительное");
        if (!isNotNeg.test(-1)) System.out.println("число -1 отрицательное");
    }
}
