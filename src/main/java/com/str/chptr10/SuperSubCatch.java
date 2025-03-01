package main.java.com.str.chptr10;
//В последовательности операторо catch подккласс исключений должен быть укказан перед его
// суперклассом иначе это приведет кк недостижимому коду и ощибке во время компиляции

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            System.out.println("Перехват исключений обзего класса  Exception");
        }
        //этот оператор catch достигнут вообще не будет ткк подкласс ArithmeticException
        //является производным от класса  Exception
//        catch (ArithmeticException e) {
//            System.out.println("Этот код вообзе не достижим");
        }
    }
//}
