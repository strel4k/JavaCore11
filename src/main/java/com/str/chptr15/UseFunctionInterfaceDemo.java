package main.java.com.str.chptr15;
import java.util.function.Function;

public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i=1; i <= n; i++)
                result *= i;
            return result;
        };
        System.out.println("факториал числа 3 равен " + factorial.apply(3));
        System.out.println("факториал числа 5 равен " + factorial.apply(5));
    }
}
